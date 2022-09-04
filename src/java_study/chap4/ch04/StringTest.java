package java_study.chap4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c3 = Class.forName("java.lang.String");

        Constructor[] cons = c3.getConstructors(); // 클래스 내에 있는 생성자 출력
        for(Constructor con: cons) {
            System.out.println(con);
        }
        System.out.println();

        Method[] methods = c3.getMethods(); // 클래스 내에 있는 메소드 출력
        for(Method method : methods) {
            System.out.println(method);
        }

    }
}
/*
Class 클래스
자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
Class 클래스의 객체는 자바 프로그램에서 사용되는 클래스들과 인터페이스들을 나타낸다고 되어 있습니다.
Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됨
Class.forName("클래스 이름") //  메서드로 클래스를 동적으로 로드 함
Class c = String.class; // 클래스 이름으로 직접 Class 클래스 가져오기
String s = new String();
Class c = s.getClass();  //Object 메서드 -> 생성된 인스턴스에서 메소드 가져오기

동적 로딩
컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime) 중에 데이터 타입을 binding 하는 방법
보통 다른 클래스 파일을 불러올때는 컴파일 시 스태틱에 그 클래스파일이 같이 바인딩이 되지만
forName으로 class파일을 불러올 때는 컴파일에 바인딩이 되지않고 런타임때 불러오게 되기 때문입니다.
즉 실행시에 불러서 사용할 수 있기 때문에 동적 로딩
단점은 클래스파일명을 직접 적게 되어 있어 만약 파일명에 오타가 나면 에러가 발생할 수 있기 때문에 주의해야합니다.

Class의 newInstance()메서드로 인스턴스 생성
new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스를 생성할 수 있음

클래스 정보 알아보기
reflection 프로그래밍 : Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드)등을 알 수 있고 인스턴스를 생성하고,
메서드를 호출하는 방식의 프로그래밍
로컬 메모리에 객체 없는 경우, 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용
java.lang.reflect 패키지에 있는 클래스를 활용하여 프로그래밍
일반적으로 자료형을 알고 있는 경우엔 사용하지 않고, 보통 .을 누루면 어떤 것들이 가능한지 알 수 있기 때문에 사용할 일은 많이 없습니다.


 */
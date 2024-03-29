package java_study.chap3.ch14;

public interface Calc {

    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //Default 메서드: 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
    default void descrption(){
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
        mystaticMethod();
    }

    //정적 메서드: 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
    static int total(int[] arr){
        int total=0;
        for (int num:arr){
            total+=num;
        }
        return total;
    }
    // private 메소드 이기때문에 재정의가 불가능하다. 인터페이스 내부에서만 사용하기 위해 구현
    private void myMethod() {
        System.out.println("private method");
    }

    private static void mystaticMethod() {
        System.out.println("private static method");
    }

}
/*
상수
모든 변수는 상수로 변환 됨 public static final

추상 메서드
모든 선언된 메서드는 추상 메서드 public abstract

디폴트 메서드 (자바 8이후)
구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
default 키워드 사용
구현 하는 클래스에서 재정의 할 수 있음
인터페이스를 구현한 클래스의 인스턴스가 생성 되어야 사용 가능함

정적 메서드 (자바 8이후)
인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드

private 메서드 (자바 9이후)
인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음
인터페이스 내부에서만 사용하기 위해 구현하는 메서드
default 메서드나 static 메서드에서 사용함
*/
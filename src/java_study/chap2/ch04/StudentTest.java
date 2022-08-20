package java_study.chap2.ch04;

//Student란 객체를 만드는 test class를 만듬
public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student(); //
        studentLee.studentID=12345;
        studentLee.setStudentName("이순신");
        studentLee.address = "서울";


        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "경주";

        studentKim.showStudentInfo();

        System.out.println(studentLee); // 참조변수, 참조값. 힙에 studentLee란 인스턴스가 가지고 있는 인스턴스 주소. JVM 가상 주소임
        System.out.println(studentKim);
    }
}
/*
인스턴스
클래스는 객체의 속성을 저의하고 기능을 구현하여 만들어 놓은 코드 상태
실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 맴버 변수를 가지게 됨
new 키워드를 사용하여 인스턴스 생성(생성자 없어도 생성은 가능)-> 힙에 저장된다.
ex)studentLee와 studentKim이라는 두개의 인스턴스가 존재, 각각의 맴버변수를 다르게 지정 가능하다.(why? 각각 다른 메모리에 위치함)

힙메모리
생성된 인스턴스는 동적 메모리(힙메모리)에 할당됨
C나 C++ 언어에서는 사용한 동적 메모리를 프로그래머가 해제 시켜야 함 (free() 난 delete 이용)
자바에서 Gabage Collector 가 주기적으로 사용하지 않는 메모리를 수거
따라서 하나의 클래스로 부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 됨

용어정리
객체: 객체 지향 프로그램의 대상, 생성된 인스턴스
클래스: 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태
인스턴스: new 키워드를 사용하여 클래스를 메모리에 생성한 상태
멤버 변수: 클래스의 속성, 특성
메서드: 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
참조 변수: 메모리에 생성된 인스턴스를 가리키는 변수
참조 값: 생성된 인스턴스의 메모리 주소 값
*/
package java_study.chap3.ch11;


public class CalculatorTest {

    public static void main(String[] args) {


        //CompleteCalc은 Calc의 타입이다.
        //CompleteCalc은 여러 인터페이스를 implement할 수 있다.
       Calc calc = new CompleteCalc(); //CompleteCalc만 생성 가능(Calc는 Interface, Calculator은
        int num1 = 10;
        int num2 = 2;

        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" +calc.substract(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" +calc.times(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" +calc.divide(num1, num2));

        CompleteCalc compcalc =(CompleteCalc) calc;
        compcalc.showInfo();
    }
}

/*
인터페이스
모든 메서드 추상 메서드로 선언 public abstract
모든 변수는 상수로 선언 public static final
자바 8 부터 디폴트 메서드(default method)와 정적 메서드(static method) 기능의 제공으로 일부 구현 코드가 있음

인터페이스 구현과 형 변환
인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환 할 수 있음
Calc calc = new CompleteCalc();
상속에서의 형 변환과 동일한 의미
클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있음 (cf. extends)
형 변환되는 경우 인터페이스에 선언된 메서드만을 사용가능함

타입상속을 했다. 구현상속은 구현 코드를 받은거고, 타입상속은 Calc 클래스가 interface 타입이라는 의미
자바에서는 클래스간 상속인 것은 싱글인 것만 가능(다중상속 x, 모호성이 생김)
인터페이스는 구현코드가 없기 때문에 다중 상속이 가능해진다.

인터페이스 하는일
클래스나 프로그램이 제공하는 기능을 명시적으로 선언
일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제공하는 명세(specification)
클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있음
어떤 객체가 하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미임
인터페이스를 구현한 다양한 객체를 사용함 - 다형성
예) JDBC 인터페이스

인터페이스 장점
1. 대규모 프로젝트 개발 시 일관되고 정형화된 개발을 위한 표준화가 가능합니다.
2. 클래스의 작성과 인터페이스의 구현을 동시에 진행할 수 있으므로, 개발 시간을 단축할 수 있습니다.
3. 클래스와 클래스 간의 관계를 인터페이스로 연결하면, 클래스마다 독립적인 프로그래밍이 가능합니다.

*/
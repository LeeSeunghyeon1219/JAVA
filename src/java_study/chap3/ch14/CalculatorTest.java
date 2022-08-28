package java_study.chap3.ch14;


import java.util.ArrayList;

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

        // 디폴트 메서드: 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
        calc.descrption();


        int [] arr={1,2,3,4,5};
        System.out.println(Calc.total(arr)); //total 함수는 정적메서드이기 때문에 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드

        // showInfo 기능은 CompleteCalc에 선언되있기 때문에 downcasting
        CompleteCalc compcalc =(CompleteCalc) calc;
        compcalc.showInfo();

    }
}

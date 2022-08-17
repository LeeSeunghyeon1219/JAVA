package java_study.chap2.ch03;

public class FunctionTest {
    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {

        int sum = 0;
        int i;

        for(i = 0; i<=100; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);

        sayHello("안녕하세요");
        int num = calcSum();

        System.out.println(total);
        System.out.println(num);
    }

}

/*
함수란?
하나의 기능을 수행하는 일련의 코드
구현된 함수는 호출하여 사용하고 호출된 함수는 기능이 끝나면 반환됨
함수로 구현된 하나의 기능을 여러곳에서 동일한 방식으로 호출되어 사용

함수호출과 스택 메모리
스택: 함수가 호출될때 지역변수들이 사용하는 메모리(
1. main 함수가 사용할 메모리 공간이 스택에생성됨
2. main 함수에서 add 함수 호출
3. add 함수가 사용할 메모리 공간이 스택에 사용됨
4. add 수행 후 메모리 자동으로 해제->add 함수가 사용한 메모리 공간 자동으로 사라짐
스택 메모리 구현
|                         |
|add 함수 사용할 메모리 공간  | --> 나중에 add 함수 수행 후 자동으로 삭제됨
|main 함수 사용할 메모리 공간 |
___________________________

메서드
객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
멤버 함수라고 함
메서드를 구현함으로써 객체의 긴으 구현
메서드 이름은 그 객체를 사용하는 객체에 맞게 짓는 것이 좋음
*/
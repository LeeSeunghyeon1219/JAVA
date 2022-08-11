package java_study.chap1.ch13;

public class BitTest {

    public static void main(String[] args) {

        int num1 = 5;  	// 00000101
        int num2 = 10; 	// 00001010

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);
        System.out.println(num1);
        System.out.println(num1 <<= 2);
        System.out.println(num1);

    }
}
/*
비트연산자
대입연산자와 다른 연산자가 함께 쓰임
마스크: 특정 비트를 가리고 몇 개의 비트 값만 사용할 때
비트켜기: 특정 비트들만을 1로 설정해서 사용하고 싶을 때 ex)  & 00001111 ( 하위 4비트 중 1인 비트만 꺼내기)
비트끄기: 특정 비트들만을 0으로 설정해서 사용하고 싶을 때 ex)  | 11110000 ( 하위 4비트 중 0 인 비트만 0으로 만들기)
비트토글:  모든 비트들을 0은 1로, 1은 0으로 바꾸고 싶을 때

비트연산자 종류
~(비트의 반전), &(비트단위 AND, 1&1->1 이외에는 0), |(비트단위 OR, 0|0->0 이외에는 1)
^(비트단위 XOR, 두개의 비트가 서로다른 경우 1 반환), <<(왼쪽 shift, a<<2는 a를 2비트만큼 왼쪽으로 이동)
>>(오른쪽 shift, a>>2,2비트만큼 오른쪽으로 이동), >>>(오른쪽 shift, >>와 동일, 채워지는 비트가 부호와 상관없이 0, >>와 <<는 부호 비트 따라감)

연산자 간의 우선순위: 연산자들끼리 우선순위가 존재한다. 그래서 사용할 때 주의해야한다!
*/
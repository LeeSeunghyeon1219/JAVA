package java_study.chap1.ch11;

public class operator {
    public static void main(String[] args) {
        int myNum=10;
        int yourNum=20;

        myNum+=yourNum; //myNum=myNum+yourNum;
        System.out.println(myNum);

        int N=1;

        System.out.println(++N); // 먼저 n값이 증가 -> 출력
        System.out.println(N++); // 먼저 n값이 출력 -> 증가
        System.out.println(N);

        int N1=5;
        System.out.println(--N1); // 먼저 n값이 감소 -> 출력
        System.out.println(N1--); // 먼저 n값이 출력 -> 감소
        System.out.println(N1);
    }
}
/*
항: 연산에 사용되는 값/ 연산자: 항을 이용하여 연산하는 기호
대입연산자: 변수에 다른 변수나, 값을 대입(=). 이항 연산자 중 우선 순위가 가장 낮음
부호연산자: 단항연산자. 부호를 +,-로 바꿈. 실제 변수의 부호가 변하려면 대입연산자를 사용
산술연산자: 사칙연산자(+,-,*,/,%)
복합대입연산자: 대입연산자와 다른 연산자를 함께 쓰임(+=,-=,*=,/=,%=,<<=,>>=,>>>=,&=,!=,^=)
증가,감소연산자: 단항연산자, 변수의 값을 1을 더하거나 뺄 때 사용. 연산자가 항의 앞에 있는가 뒤에있는가에 따라 연산시점과 결과가 달라짐
*/

package java_study.chap1.ch12;

public class LogicalTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag); //true

        flag = (num1 < 0) && (num2 > 0);
        System.out.println(flag); //false

        flag = (num1 > 0) || (num2 > 0);
        System.out.println(flag); //true

        flag = (num1 < 0) || (num2 > 0);
        System.out.println(flag); //true

        flag = !(num1 > 0);
        System.out.println(flag); //false
    }
}
/*
논리연산자: 관계 연산자와 혼합하여 많이 사용. 연산자의 결과가 참, 거짓으로 변환
&&: 두항이 모두 참인 경우에만 결과가 참
||: 두항 중 하나만 참이면 결과가 참
!: 단항 연산자. 참인 경우 거짓, 거짓인 경우 참
*/
package java_study.ch13;
import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        int max;
        System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n ");

        //Scanner라는 객체를 사용하여 입력을 받을 수 있다.
        //System.in은 시스템의 표준 입력을 말함
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력1:");
        int x = scanner.nextInt();
        System.out.println("입력2:");
        int y = scanner.nextInt();

        max = (x > y) ? x : y;
        System.out.println(max);
    }
}
/*
조건 연산자
삼항 연산자.
조건식? 결과1:결과2;
조건식의 결과가 참이면 결과1, 거짓인 경우 결과2 선택

*/
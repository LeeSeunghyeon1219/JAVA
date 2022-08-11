package java_study.chap1.ch14;
import java.util.Scanner;
public class IfElseTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if( age >= 8) {
            System.out.println("학교에 다닙니다");
        }
        else {
            System.out.println("학교에 다니지 않습니다.");
        }
    }
}
/*
조건문: 주어진 조건에 따라 다른 실행이 이루어지도록 구현
if문 문법
if(조건식){
    수행문;// 조건이 참일 경우 수행하게 된다.
}
if-else문 문법
if(조건식){
    수행문1; // 조건이 참일 경우 수행문1 수행
}
else{
    수행문2; // 조건이 참이 아닌경우, 수행문2 수행
}
*/


package java_study.chap1.ch05;

public class Variable_Test {
    public static void main(String[] args) {
        int age, count;
        age = 10;

        int level = 10000;
        System.out.println(age);
        System.out.println(level);
    }

}
/*
패키지 이름은 무조건 소문자, 클래스 이름은 대문자로 시작
프로그램에서는 항상 변하는 값을 나타낼 필요가 있음( ex. 학생의 성적, 합계, 게임의 레벨, 회원 주소 등등...)
표현하려는 수에 맞는 데이타 타입(자료형)을 이용하여 변수를 선언
표현하려는 자료가 숫자, 문자, 문자열등 다양할 수 있으므로 그에 맞는 자료형을 사용
나중에 알아볼 수 있게 가독성이 좋게 하는 것이 좋다. -> int ns;(x) int numberOfStudent;(o)
 */

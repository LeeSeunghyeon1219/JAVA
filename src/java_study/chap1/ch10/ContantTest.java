package java_study.chap1.ch10;

public class ContantTest {
    public static void main(String[] args){
        final int MAX_NUM=100;
        final int MIN_NUM;

        MIN_NUM=0;
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

//        MIN_NUM=22; // 사용 불가능하다(이유: 상수로 선언한 값은 변경이 불가능하다)
    }

}
/*
상수(Constant) 선언하기
- 상수는 변하지 않는 수(원주유, 1년이 12개월)
- final 예약어를 사용하여 사용하여 선언
- 상수는 보통 대문자로 표현한다.
리터럴
- 프로그램에서 사용하는 숫자, 문자, 논리값을 말함
- 리터럴은 상수 풀 에 있다.( 상수풀에대해 공부할 것!)
- 정수 리터럴은 int 로 실수 리터럴은 double로 ㅓ장된다.
- 정수의 범위가 넘어가는 경우, L,l / float를 사용하는 경우 F,f식별자를 써줘야 함
*/
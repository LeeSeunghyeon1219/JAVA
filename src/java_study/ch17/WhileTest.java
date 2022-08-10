package java_study.ch17;

public class WhileTest {

    public static void main(String[] args) {

        int num = 1;
        int sum  = 0; //지역변수는 자동으로 초기화 되지 않는다. 따라서 기본 값이 필요함

        while( num <= 10) {
            sum += num;
            num++;
        }

        System.out.println(sum);
        System.out.println(num);
    }
}
/*
반복문 while 문
주어진 조건에 참일 때(true) 지정된 수행문을 반복적으로 수행하는 제어문
조건이 맞지 않으면 반복하던 수행을 멈추게 됨
조건은 주로 반복 횟수나 값의 비교의 결과에 따라 true, false 판단
무한루프: while(true)
*/

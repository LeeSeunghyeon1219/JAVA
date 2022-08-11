package java_study.chap1.ch16;

public class SwitchCaseUpTest {

    public static void main(String[] args) {

        int month = 3;

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10,12 ->
                31;
            case 4,6,9,11 ->
                30;
            case 2 ->
                28;
            default->{
                System.out.println("존재하지 않는 달 입니다.");
                yield 0; //반환 값이라는 의미
            }
        };
        System.out.println(month + "월은 " + day + "일입니다.");
    }
}
/*
JAVA 14 부터 지원되는 Switch문
간단하게 쉼표(,)로 조건 구분
yield 키워드 사용
식으로 표현하여 반환값을 받을 수 있음. 리턴 값이 없는 경우 오류 발생
*/
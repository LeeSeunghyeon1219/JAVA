package java_study.chap3.ch10;

public class Define {

    public static final int MIN = 1;
    public static final int MAX = 999999;
    public static final double PI = 3.14;
    public static final String GREETING = "Good Morning!";
    public static final int MATH_CODE = 1001;
    public static final int CHEMISTRY_CODE = 1002;
    public static final void result_print(String val){
        System.out.println("결과는" +val+"입니다.");
    }

}
/*
final 예약어 사용하기
final 변수: 값이 변경될 수 없는 상수
final 메서드: 하위 클래스에서 재정의 할 수 없는 메서드
final 클래스 : 상속할 수 없는 클래스
*/
package java_study.chap2.ch10;

public class BirthdayTest {
    public static void main(String[] args){
        Birthday date = new Birthday();
        // private로 설정하였기 때문에 set/get으로만 설정할 수 있다 (.)으로 직접 변수 설정 안됨
        // 맴버변수에 값이 노출되거나 문제생기는 것을 막을 수 있다.
        // private로 값을 막아주고 get/set을 사용하여 제어해준다.

        date.setYear(1996);
        date.setMonth(13);
        date.setDay(19);

        date.showDate();

    }
}

package java_study.chap3.ch14;


public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0)
            return ERROR;
        else
            return num1 / num2;
    }

    @Override
    public void descrption() {
        System.out.println("CompleteCalc overriding");
    }


    public void showInfo() {
        System.out.println("모두 구현하였습니다.");
    }
}

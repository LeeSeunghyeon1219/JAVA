package java_study.chap3.ch09;

public class MyNotebook extends Notebook{

    //Notebook에서 재정의 하지 않은 추상메서드를 재정의함
    @Override
    void display() {
        System.out.println("MyNoteBook display");
    }
}

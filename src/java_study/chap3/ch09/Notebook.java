package java_study.chap3.ch09;

public abstract class Notebook extends Computer{

    //아직 구하지 않은 메소드가 있음 -> 만약 그럴경우 이 클래스를 추상클래스로 하면 됨
    @Override
    void typing() {
        System.out.println("NoteBook typing");
    }
}

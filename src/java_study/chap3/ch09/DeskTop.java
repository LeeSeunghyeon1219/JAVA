package java_study.chap3.ch09;

public class DeskTop extends Computer{
    @Override
    void display() {
        System.out.println("DeskTop display");
    }

    @Override
    void typing() {
        System.out.println("DeskTop typing");
    }
    @Override
    public void turnOff() {
        // 상위클래스에서 구현을 했지만, 하위클래스에서 재정의 가능
        System.out.println("Desktop turnoff");
    }

}

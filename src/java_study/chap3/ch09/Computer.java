package java_study.chap3.ch09;

public abstract class Computer {
    // 추상클래스: 이 클래스에서 구현하지 못할 메서드는 그냥 놓고, 하위클래스에 그 책임을 위임

    abstract void display();
    abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    } // 공통으로 쓸 메소드는 구현한다.

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
/*
추상 클래스 구현하기
메서드에 구현 코드가 없으면 abstract 로 선언(기울기체로 표시)
abstract로 선언된 메서드를 가진 클래스는 abstract로 선언
모든 메서드가 구현 된 클래스라도 abstract로 선언되면 추상 클래스로 인스턴스화 할 수 없음
추상 클래스의 추상 메서드는 하위 클래스가 상속 하여 구현
추상 클래스 내의 추상 메서드: 하위 클래스가 구현해야 하는 메서드
추상 클래스 내의 구현된 메서드: 하위 클래스가 공통으로 사용하는 메서드 (필요에 따라 하위 클래스에서 재정의)
*/

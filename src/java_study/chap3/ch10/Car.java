package java_study.chap3.ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // final로 선언하여 하위 클래스가 재정의 할 수 없음
    // 순서가 바뀌면 안되므로 final로 정의해야함
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }


}

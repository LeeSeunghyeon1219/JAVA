package java_study.chap3.ch10;

public class CarTest {
    public static void main(String[] args){
        Car aiCar = new AICar();
        aiCar.run();

        Car manualCar = new ManualCar();
        manualCar.run();

    }

}
/*
탬플릿 메서드 패턴
특정 작업을 처리하는 일부분을 서브 클래스로 캡슐화하여 전체적인 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내용을 바꾸는 패턴
추상 메서드나 구현된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
final로 선언하여 하위 클래스에 재정의할 수 없게 함
프레임워크에서 많이 사용하는 설계 패턴->시나리오가 정해져있기 때문에 가능
추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의 하고 하위 클래스에서  다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현 하도록 함
*/
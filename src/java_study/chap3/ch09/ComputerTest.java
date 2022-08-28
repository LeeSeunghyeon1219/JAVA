package java_study.chap3.ch09;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        Notebook myNote = new MyNotebook();
    }


}
/*
추상클래스(abstract class)란?<->콘클리트 클래스
구현 코드 없이 메서드 선언만 있는 추상 메서드를 포함한 클래스
메서드 선언(declaration): 반환타입, 메서드 이름, 매개변수로 구성
메서드 정의(definition): 메서드 구현(implementation)과 동일한 의미 구현부(body) 를 가짐 ({ })
예) int add(int x, int y); // 선언
    int add(int x, int y){ } // 구현부가 있음, 추상 메서드 아님
abstract 예약어를 사용
추상 클래스는 new 할 수 없음 (인스턴스화 할 수 없음)

추상 클래스 구현하기



*/
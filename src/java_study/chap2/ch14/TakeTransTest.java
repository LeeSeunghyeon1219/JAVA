package java_study.chap2.ch14;

public class TakeTransTest {

    public static void main(String[] args){
        Student studentJ= new Student("James",3000);
        Student studentT= new Student("Tomas",10000);

        Bus bus100=new Bus(100);
        Subway subwayGreen=new Subway(2);

        studentJ.takeBus(bus100);
        studentJ.takeBus(bus100);
        studentJ.takeBus(bus100);


        studentJ.showInfo();
        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);
        studentT.showInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();

    }
}
/*
객체 지향 프로그램이 뭘까?
객체를 선언해야 한다 -> 어떤 것을 객체로 만들 것이고, 객체의 기능, 책임. 객체의 이름에 맞는 유일한 일을 해야한다.
객체간의 협력이 이루어져야 한다.

객체지향프로그래밍에서의 객체간의 협력
객체 지향 프로그램에서 객체 간에는 협력이 이루어짐
협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야 함
매개 변수로 객체가 전달되는 경우가 발생
[ex]
학생에는 이름, 학년 가진돈에 대한 정보가 있다.
버스에는 버스번호, 승객 수, 수입의 정보가 있다.
지하철에는 노선번호, 승객 수, 수입의 정보가 있다.
인스턴스가 여러개 인데 하나의 버스를 타는 것이기 떄문에 버스 자체가 매개변수로 전달 될 수 있다.
*/
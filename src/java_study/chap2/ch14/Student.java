package java_study.chap2.ch14;

public class Student {

    String studentName;
    int money;

    public Student(String name, int money){
        this.studentName=name;
        this.money=money;
    }

    public void takeBus(Bus bus){
        int bus_price=1000;
        if (this.money-bus_price>=0) {
            bus.take(bus_price);
            this.money -= bus_price;
        }
        else {
            System.out.println(studentName+"은 돈이 부족해서 "+bus.busNumber+"번 버스를 탈 수 없습니다.");
        }
    }

    public void takeSubway(Subway subway){
        int subway_price=1200;
        if (this.money-subway_price>=0){
            subway.take(subway_price);
            this.money-=subway_price;
        }
        else{
            System.out.println(studentName+"은 돈이 부족해서 "+subway.lineNumber+"번 지하철을 탈 수 없습니다.");

        }
    }

    public void takeTaxi(Taxi taxi,int price){
        taxi.take(price);
        this.money-=price;
    }
    public void showInfo() {
        System.out.println(studentName +"님의 남은 돈은 " + money + "원 입니다");
    }
}

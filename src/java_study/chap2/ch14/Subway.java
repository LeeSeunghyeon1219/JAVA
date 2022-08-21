package java_study.chap2.ch14;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int Number){
        this.lineNumber=Number;
    }
    public void take(int money){
        this.money+=money;
        this.passengerCount++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }

}

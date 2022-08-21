package java_study.chap2.ch19;

public class Car {
    private static int SerialNum=10000; // 인스턴스 별로 공유 해야 하기 떄문에 static으로 짜야함
    private int carNum;

    public Car(){
        SerialNum++;
        carNum=SerialNum;
    }
    public int getCarNum(){
        return carNum;
    }
    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}

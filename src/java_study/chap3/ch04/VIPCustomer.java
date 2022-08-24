package java_study.chap3.ch04;

public class VIPCustomer extends Customer {
    //매출에 더 많은 기여를 하는 단골 고객 제품을 살때 10%를 할인해 줌
    //보너스 포인트는 제품 가격의 5%를 적립해 줌 담당 전문 상담원이 배정됨
    //Customer 클래스에 추가하면 agentID, salesRatio가 추가해야 하고 if문으로 해야됨. 그래서 불편함
    //if~else 조건이 많은 경우 상속을 생각해보자!

    private int agentID;
    double salesRatio;

    public VIPCustomer(int customerID, String customerName) {

        super(customerID,customerName); //상속받은 생성자일 경우 기본적으로 들어감!
        customerGrade = "VIP";    //오류 발생(Why? 상속 받은 함수일 경우, private 변수들은 접근 되지 않음)
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override // Override가 필요할 때, @를 사용하여 똑같은 함수 재정의한다고 표현해줘야한다.
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

}

/*
super 키워드
하위 클래스에서 가지는 상위 클래스에 대한 참조 값
super()는 상위 클래스의 기본 생성자를 호출 함
하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출 됨 (이때 반드시 상위 클래스의 기본 생성자가 존재 해야 함)
상위 클래스의 기본 생성자가 없는 경우 ( 다른 생성자가 있는 경우 ) 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출 함
*/
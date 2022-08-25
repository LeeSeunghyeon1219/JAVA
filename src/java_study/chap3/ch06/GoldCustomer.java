package java_study.chap3.ch06;

public class GoldCustomer extends Customer {
    //제품을 살때는 10프로를 할인해준다
    //보너스 포인트는 2%를 적립해준다
    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "Gold";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

}

/*
반 고객과 VIP 고객 중간 멤버십 만들기
고객이 늘어 일반 고객보다는 많이 구매하고 VIP보다는 적게 구매하는 고객에게도 해택을 주기로 했다.


*/
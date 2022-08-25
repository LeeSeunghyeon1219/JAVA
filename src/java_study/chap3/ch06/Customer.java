package java_study.chap3.ch06;

public class Customer {
   //고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
   //일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
    protected int customerID; //상위 클래스에 선언된 private 멤버 변수는 하위 클래스에서 접근 할 수 없음->외부 클래스는 접근 할 수 없지만, 하위 클래스는 접근 할 수 있도록 protected 접근 제어자를 사용
    protected String customerName;
    protected String customerGrade;

    int bonusPoint;
    double bonusRatio;

    public Customer(int customerID, String customerName){
        this.customerID=customerID;
        this.customerName=customerName;

        customerGrade="SILVER";
        bonusRatio=0.01;
    }

    public int calcPrice(int price){
        bonusPoint+=price*bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return "이름: "+customerName+" / 등급: "+customerGrade+" / 보너스 점수: "+bonusPoint;
    }
    public int  getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int  customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
/*
회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과
이보다 충성도가 높은 우수고객(VIPCustomer)에 따른 서비스를 제공하고자 함

물품을 구매 할때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다름
여러 멤버십에 대한 각각 다양한 서비스를 제공할 수 있음
멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기
*/
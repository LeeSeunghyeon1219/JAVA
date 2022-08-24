package java_study.chap3.ch01;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(10020,"김유신"); // VIPcustomer 클래스가 상 Customer를 상속받았기 때문에 해당 클래스의 기능을 쓸 수 있다.
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        // 형변환(업케스팅)
        Customer vc= new VIPCustomer(12345,"Up Casting Test"); //하위클래스를 생성했는데 형변환은 상위 클래스로 했음
        System.out.println(vc.customerGrade);// type는 customer이라, Customer 클래스의 변수만 사용가능함!(전부 사용하려면 overrideing 아니면 다운casting 해야함
    }

}
/*
클래스 상속
새로운 클래스를 정의할 때 이미 구현된 클래스를 상속 받아서 속성이나 기능을 확장하여 클래스를 구현
이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할 때 기존 클래스를 상속
상속하는 클래스 : 상위 클래스, parent class, base class, super class
상속받는 클래스 : 하위 클래스, child class, derived class, subclass

상속의 문법
class B extends A{
}
extends 키워드 뒤에는 단 하나의 클래스만 올 수 있음 -> 여러개가 올 경우 모호성이 발생할 수 있다.
* 자바는 단일 상속(single inheritance)만을 지원함

상속을 구현 하는 경우
일반적인 개념을 가진 클래스가 있는데, 그것과 유사한 클래스를 만들 건데, 좀 더 구체적이고 specific 한 클래스를 만들고싶어함
상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가짐
하위 클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가짐
하위 클래스가 상위 클래스의 속성과 기능을 확장 (extends)한다는 의미
[ex] 사람->포유류 (사람은 포유류에 속한다)
class Mammal{
}
class Human extands Mammal{ // 확장한다는 의미의 설계!
}

하위 클래스가 생성 되는 과정
하위 클래스를 생성하면 상위 클래스가 먼저 생성 됨 / new VIPCustomer()를 호출 -> Customer()가 먼저 호출
클래스가 상속 받은 경우 하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출 함

상속에서 인스턴스 메모리의 상태
상위 클래스 생성자 호출->하위 클래스 생성자 호출
private 변수들은 만들어지기는  하는데 접근하지 못하는 것이다!

형 변환(업캐스팅)
하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능함
상속 관계에서 모든 하위 클래스는 상위 클래스로 형 변환(업캐스팅)이 됨  (거꾸로 성립하지 않음)
1. 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성
Customer customerLee = new VIPCustomer();
2. 상위 클래스 타입의 변수에 하위 클래스 변수가 대입
VIPCustomer vCustomer = new VIPCustomer();
addCustomer(vCustomer); //
int addCustomer(Customer customer){ }
*/
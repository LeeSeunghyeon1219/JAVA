package java_study.chap3.ch15;

interface Buy {
    void buy();

    default void order(){
        System.out.println("Buy order");
    }
}

interface Sell {
    void sell();

    default void order(){
        System.out.println("Sell order");
    }
}

class Customer implements Buy,Sell{
    @Override
    public void sell(){
        System.out.println("customer sell");
    }
    @Override
    public void buy(){
        System.out.println("customer buy");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    // Buy꺼를 사용하겠다는 의미. Sell꺼를 사용할 수도 있다.
    @Override
    public void order(){
        System.out.println("customer order");
    }
}

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.sayHello();

        Buy buyer = customer; //업케스팅
        buyer.buy();
        buyer.order(); //재정의된 Virtual Method에 의해 하나만 출력됨

        Sell seller = customer;
        seller.sell();
        seller.order();

    }

}

/*
여러 인터페이스 구현하기
자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스는 구현 할 수 있음
디폴트 메서드가 중복 되는 경우는 구현 하는 클래스에서 재정의 하여야 함
여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환 되는 경우 해당 인터페이스에 선언된 메서드만 사용 가능 함

클래스는 여러개를 인터페이스 할 수 없는 이유(다중상속 불가)
다이아몬드 플라블럼 때문에 되지 않음
다중상속이 된다고 했을 때, 아래와 같이 되어있다고 가정해본다면
A에도 a()란 함수가 있고, B,C에도 a()란 함수를 재정의 했을 때
D d=new D();를 했다. 그러면 모호성이 발생하기 때문에 어려워진다.
자바언어는 기능을 많아지고, 기능이 좋아지는 것보다는 안전한 것을 중요시함
   A
 B   C
   D

인터페이스의 상속
인터페이스에서도 상속을 할 수 있음
extends키워드 사용
인터페이스는 다중상속이 가능하고 구현 코드의 상속이 아니므로 타입상속이라고함

클래스 상속과 인터페이스 구현 함께 쓰기
실무에서 프레임워크나 오픈소스와 함께 연동되는 구현을 하게 되면 클래스 상속과 인터페이스의 구현을 같이 사용하는 경우가 많음




*/
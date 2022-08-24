package java_study.chap3.ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        customerLee.bonusPoint = 1000;
        int price=customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + " / 지불금액은 " + price  + "원 입니다.");


        VIPCustomer customerKim = new VIPCustomer(10020,"김유신"); // VIPcustomer 클래스가 상 Customer를 상속받았기 때문에 해당 클래스의 기능을 쓸 수 있다.
        customerKim.bonusPoint = 10000;
        price=customerKim.calcPrice(1000);

        System.out.println(customerKim.showCustomerInfo() + " / 지불금액은 " + price  + "원 입니다.");

        // 형변환 했을 경우 어떤 결과가 나올까? -> 변수 타입은 상위 클래스이지만, 인스턴스의 타입은 하위 클래스임
        Customer vc = new VIPCustomer(10030, "나몰라");
        vc.bonusPoint = 10000;
        int priceNo = vc.calcPrice(10000);
        System.out.println(vc.showCustomerInfo() + " / 지불금액은 " + priceNo  + "원 입니다.");

    }

}
/*
오버라이딩(overriding)
상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음

@overriding 애노테이션 (annotation)
애노테이션은 원래 주석이라는 의미
컴파일러에게 특별한 정보를 제공해주는 역할
@Override: 재정의된 메서드라는 정보 제공. 재정의 된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러가 남
@FuctionalInterface: 함수형 인터페이스라는 정보 제공
@Deprecated: 이후 버전에서 사용되지 않을 수 있는 변수, 메서드에 사용됨
@SuppressWarnings: 특정 경고가 나타나지 않도록 함

형 변환과 오버라이딩 메서드 호출
Customer vc = new VIPCustomer();
vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 임
자바에서는 항상 인스턴스의 메서드가 호출 됨 (가상메서드의 원리)
자바의 모든 메서드는 가상 메서드(virtual method) 임

메서드는 어떻게 호출되고 실행 되는가?
메서드(함수)의 이름은 주소값을 나타냄 (오버로딩 같은 경우 이름은 같아도, 다른 주소값으로 저장된다)
메서드는 명령어의 set 이고 프로그램이 로드되면 메서드 영역(코드 영역)에 명령어 set이 위치(명령어 set은 인스턴스마다 다르지 않다!)
해당 메서드가 호출 되면 명령어 set 이 있는 주소를 찾아 명령어가 실행됨(* 변수의 영역은 따로 존재: 지역변수는 stack, 인스턴스우는 heap)
-> 메서드에서 사용하는 변수들은 스택 메모리에 위치
-> 다른 인스턴스라도 같은 메서드의 코드는 같으므로 같은 메서드가 호출됨
따라서 인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만, 메서드 명령어 set은 처음 한번만 로드 됨

가상메서드의 원리
가상 메서드 테이블(vitual method table)에서 해당 메서드에 대한 address를 가지고 있음
재정의된 경우는 재정의 된 메서드의 주소를 가리킴
즉, 생성된 인스턴스 쪽에서 재정의가 되면 재정의된 함수를 호출하게 된다.
링크: https://gitlab.com/easyspubjava/javacoursework/-/blob/master/Chapter3/3-05/README.md
*/
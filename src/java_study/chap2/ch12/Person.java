package java_study.chap2.ch12;

public class Person {

    String name;
    int age;

    // 이미 생성자가 있을 경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
    public Person() {
        this("이름없음", 1); // 아래 생성자가 호출됨
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name+","+age);
    }

    public Person getPerson(){
        return this; //자기 자신을 반환한다.
    }
    public static void main(String[] args){
        Person p1 = new Person();
        p1.showPerson();

        Person p2=new Person("LeeSunSin",27);
        p2.showPerson();

        //두개의 결과는 같다.
        System.out.println(p1);
        System.out.println(p1.getPerson());

    }
}

/*
객체 자신을 가리키는 this. this 가 하는일
인스턴스 자신의 메모리를 가리킴
생성자에서 또 다른 생성자를 호출할 때 사용
자신의 주소(참조값)을 반환함
1. 생성된 인스턴스 메모리의 주소를 가짐
- 클래스 내에서 참조변수가 가지는 주소 값과 동일 한 주소 값을 가지는 키워드
2. 생성자에서 다른 생성자를 호출 하는 this
- 클래스에 생성자가 여러 개 인경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
- 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없음
3. 자신의 주소를 반환하는 this
* super도 this와 비슷하게 사용한다.
*/
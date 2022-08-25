package java_study.chap3.ch06;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }

}
class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
    }
}

public class AnimalTest {

    public static void main(String[] args){
        Animal hAnimal = new Human(); // 여러 클래스를 하나의 상위클래스로 핸들링을 한다.
        Animal tAnimal = new Tiger(); // -> 가상 메서드 방식으로 인해 move의 메서드가 각자 다르게 호출됨
        Animal eAnimal = new Eagle(); // -> 대신 각자의 하위 클래스가 가지고 있는 함수들에 대해서는 호출할 수 없다.(이럴경우, 다운케스팅을 해야함)

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal); //이것들은 Animal 타입이기 때문에! 어
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        // ArrayList 배열 사용하기
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal); //어떤 Animal인지에 따라서 다양한 결과가 출력하게 된다.
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList) {
            animal.move();
        }

        System.out.println("=================DownCasting Test=================");
        for(Animal animal : animalList) {
            test.DoSomething_Donwcasting(animal);
        }
    }
    public void moveAnimal(Animal animal) {//어떤 인스턴스가 들어갔냐에 따라 move의 인플리맨테이션이 다르다!
        animal.move();
    }

    public void DoSomething_Donwcasting(Animal animal){

        if (animal instanceof Human){
            Human human = (Human) animal;
            human.readBooks();
        } else if (animal instanceof Tiger) {
            Tiger tiger =(Tiger) animal;
            tiger.hunting();
        } else if (animal instanceof Eagle) {
            Eagle eagle = (Eagle) animal;
            eagle.flying();
        } else{
            System.out.println("ERROR");
        }


    }


}
/*
다형성(polymorphism) 이란?
전재조건: 1. 상속 / 2. 메소드 오버라이딩
부모-자식 상속 관계에 있는 클래스에서 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
상위 클래스가 동일한 메시지로 하위 클래스들을 서로 다르게 동작시키는 객체 지향 원리
정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음

상속을 하게 되면 하위클래스들의 상위 클래스 타입으로 모두 핸들링 할 수 있다.
클래스 결합도가 타이트해짐(상위클래스바꾸면 하위클래스가 바뀔수 있다)
상속을 하면 공통으로 쓰이는 메서드들은 상위클래스에 선언하면된다.

다형성을 사용하는 이유?
상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들 수 있음
상위 클래스에서는 공통적인 부분을 제공하고 하위 클래스에서는 각 클래스에 맞는 기능 구현
여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 있음
만약 다형성을 사용하지 않으면 if-else 구문으로 구현 -> 유지보수가 어려워짐

상속은 언제 사용 할까?
1. IS-A 관계(is a relationship : inheritance)
일반적인(general) 개념과 구체적인(specific) 개념과의 관계
상위 클래스: 하위 클래스보다 일반적인 개념 (예: Employee)
하위 클래스: 상위 클래스보다 구체적인 개념들이 더해짐 (예: Engineer, Manager...)
상속은 클래스간의 결합도가 높은 설계
상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음
계층구조가 복잡하거나 hierarchy가 높으면 좋지 않음
2. HAS-A 관계(composition, 속한다.)
클래스를 재활용 하고싶다고해서 무조건 받는 것은 아니다.
클래스가 다른 클래스를 포함하는 관계 (변수로 선언)
코드 재사용의 가장 일반적인 방법
Student가 Subject를 포함하는 Library를 구현할 때 ArrayList 생성하여 사용
상속하지 않음

다운케스팅
업케스팅된 클래스를 다시 원래 타입으로 형 변환
하위클래스로의 형 변환은 명시적으로 해아함
오브젝트 클래스(가장 최상위 클래스)로 반환이 되는경우, 오브젝트클래스에서 원래 클래스로 갈 경우에도 사용
VIPCustomer vCustomer = (VIPCustomer)vc;

instanceof를 이용하여 인스턴스의 형 체크
원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 true 아니면 false를 반환 함


*/
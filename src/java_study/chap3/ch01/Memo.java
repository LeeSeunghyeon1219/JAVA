package java_study.chap3.ch01;

public class Memo {
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

*/
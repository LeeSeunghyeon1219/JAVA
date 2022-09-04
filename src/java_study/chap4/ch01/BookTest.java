package java_study.chap4.ch01;
class Book{

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //toString() 메서드
    //객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
    // String이나 Integer 클래스는 이미 재정의 되어 있음
    public String toString() {
        return title + "-" + author;
    }
}

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 헤세");

        System.out.println(book);
    }
}

/*
Object class: 모든 클래스의 최상위 클래스
Object 클래스는 java.lang 패키지 안에 들어가있음

java.lang 패키지
프로그래밍시 import 하지 않아도 자동으로 import 돈다.
import.java.lang.*;
많이 사용하는 기본 클래스들이 속한 패키지

모든 클래스는 Object 클래스를 상속 받는다
java.lang.Object 클래스
모든 클래스의 최상위 클래스는 모든 클래스는 Object에서 상속받고, Object 클래스의 메서드 중 일부는 재정의해서 사용할 수 있음
(단, final로 선언된 메서드들은 재정의 불가!)
컴파일러가 extends Object를 추가함
class Student => class Student extends Object


*/
package java_study.chap2.ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    // 생성자 이름은 동일하게 여러개를 가질 수 있다. Overloading
    public Student(){}
    //생성자: 객체를 생성할 떄 호출하는 매서드. 생성자 명은 class 명과 동일!
    public Student(int studentNumber, String studentName, int grade) {
        //멤버변수를 참조하는 this.멤버변수명(변수이름이 같을 경우!)
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}

/*
생성자
생성자 기본 문법: <class_name>([<argument_list]){[<statements]}
객체를 생성할 때 new 키워드와 함께 사용 - new Student();
생성자는 일반 함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new 와 함께 호출 되어 만들어진다.
역할: 객체가 생성될 때 변수나 상수를 초기화 하거나 다른 초기화 기능을 수행하는 메서드를 호출 한다.
생성자는 반환 값이 없고, 클래스의 이름과 동일
생성자도 overloading 가능하고 상속이 안되는 유일한 멤버메서드이다.
대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private 으로 선언되는 경우도 있음


기본생성자
클래스에는 반드시 적어도 하나 이상의 생성자가 존재한다.
클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있다.
클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어 준다.
public Student(){}
매개 변수가 없음, 구현부가 없음
* */
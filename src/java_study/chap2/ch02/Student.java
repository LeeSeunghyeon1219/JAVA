package java_study.chap2.ch02;


public class Student { //public 으로 가진 class는 하나여야 한다. 이외에는 class

    int studentNumber;
    String studentName;
    int majorCode;
    String majorName;
    int grade;

}
/*
생활 속에서 객체 찾아 클래스로 구현해 보기
ex) 온라인 쇼핑몰에 회원 로그인을 하고 여러 판매자가 판매하고 있는 제품 중 하나를 골라 주문을 한다(회원, 판매자, 제품, 주문)
ex) 아침에 회사에 가는 길에 별다방 커피숍에 들려 아이스 카페라떼를 주문했다(회사, 커피숍, 커피, 바리스타)
ex) 성적확인을 위해 학사 관리 시스템에 로그인 하여 수강 한 과목들의 성적을 확인했다(학생, 과목, 교수, 강의실, 통계자료)

클래스는 객체의 청사진이다.
각 클래스가(객체)가 가지고 속성은 클래스의 맴버변수로 선언
접근제어자: 정보 은닉을 위해 해당 조건이 해당 클래스 내에서만 사용될 수 있도록 해주는것

객체 지향 프로그램을 할 때는 객체를 정의하고 각 객체의 속성을 멤버변수로 역할을 메서드로 구현하고 각 객체간 협력을 구한다.
클래스 코딩할 때 대문자로 시작하는 것읻 좋고, public 클래스는 하나이고 public class와 .java 파일은 동일해야 한다. camel notation 방식으로 명명



*/
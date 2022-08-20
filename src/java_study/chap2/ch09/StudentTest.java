package java_study.chap2.ch09;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(100, "Lee");
//        studentLee.korea.subjectName="Test"; // 이런식으로도 지정할 수 있다!
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 95);


        Student studentKim = new Student(101, "Kim");
        studentKim.setKoreaSubject("국어", 80);
        studentKim.setMathSubject("수학", 99);

        studentLee.showStudentSocre();
        studentKim.showStudentSocre();
    }


}
/*
참조 자료형
변수의 자료형은 기본자료형과 참조자료형으로 나뉜다.
- 기본자료형: int, long, float, double 등
- 참조자료형: String, Date, Student 등
클래스형은 변수를 선언
기본자료형은 사용하는 메모리 크기가 정해져 있지만, 참조자료형은 클래스에 따라 다르다.
참조자료형을 사용할 떄마다 해당 변수에대해 생성해야 한다.(String은 예외)

참조자료형 정의하여 사용하기(예시)
학생이 수강한 과목들에 대한 성적을 산출하기 위해 학생 클래스 속성에 과목이 모두 있으면 불합리함
학생과 과목에대한 클래스 분리 -> Subject 클래스를 활용하여 수강한 과목들의 변수 타입으로 선언
선언되 Subject 변수는 생성된 인스턴스가 아니므로 Student 생성자에서 생성하여 사용

*/
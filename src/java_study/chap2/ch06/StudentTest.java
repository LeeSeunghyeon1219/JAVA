package java_study.chap2.ch06;

public class StudentTest {

    public static void main(String[] args) {


        Student studentLee = new Student(12345, "Lee", 3);
        String data = studentLee.showStudentInfo();
        System.out.println(data);

        Student studentKim = new Student(); // 생성자를 만들었을 경우 제공되지 않는다!(Overloading 이면 가능)
        String data1 = studentKim.showStudentInfo();
        System.out.println(data1);

    }

}


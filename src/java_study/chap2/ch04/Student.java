package java_study.chap2.ch04;


public class Student {
    //멤버 변수로 선언
    public int studentID;
    public String studentName;
    public String address;

    // 메서드 구현현
   public void showStudentInfo(){
       System.out.println("학번:"+studentID+" / 이름:"+studentName+" / 주소:"+address);
    }

    public String getStudentName(){
       return studentName;
    }

    public void setStudentName(String name){
       studentName=name;
    }
}

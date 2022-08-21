package java_study.chap2.ch24;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    Student(int studentID,String studentName){
        this.studentID=studentID;
        this.studentName=studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String SubjectName,int score){
        Subject subject =new Subject(SubjectName,score);
        subjectList.add(subject);
    }
    public void showStudentInfo(){
        int total=0;
        for(Subject s:subjectList){
            total+=s.getScore();
            System.out.println("학생 "+studentName+"의 "+s.getName()+" 과목 성적은 "+s.getScore()+"입니다");
        }
        System.out.println("학생 "+studentName+"의 총점은 "+total+" 입니다");
    }
}

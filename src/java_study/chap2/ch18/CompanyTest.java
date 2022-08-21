package java_study.chap2.ch18;

public class CompanyTest {

    public static void main(String[] args){

        // static 메서드로 제공해야한다.
        //Company compnay1=new Company()// 'Company()' has private access
        Company company1=Company.getInstance();
        Company company2=Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
    }
}
/*
클래스 다이어그램
_________________
|   Singleton   | // 클래스 이름
-----------------
| - instance    | // 변수이름. instance라는 private 멤버변수가 있다.
-----------------
| - instance    | // 생성자와 메서드
| + getInstance | // - 는 private, +는 public
-----------------


 */
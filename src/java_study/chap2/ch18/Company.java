package java_study.chap2.ch18;

public class Company {

    private static Company instance = new Company(); // 유일한 Company의 객체임
    // 외부에서는 Company를 여러개 생성 가능 -> deafault 생성자로 인해서 여러개 생성 가능
    // Singleton은 외부에서 마음대로 new 할 수 없다로 생성자를 제공
    private Company(){

    }

    //외부에서 getInstance 써야하는데, 인스턴스를 생성하고 호출해야 함. 따라서 static으로 생성
    public static Company getInstance(){
        if(instance==null){
            instance=new Company();
        }
        return instance;
    }
}

/*
싱글톤 페턴
프로그램에서 인스턴스가 단 한개만 생성되어야 하는 경우 사용되는 디자인 패턴
static 변수, 매서드를 활용하여 구성할 수 있음
ex) 시간
회사안에는 사원이 여려명 있을 수 이씨만 회사라는 객체는 유일하다.


*/


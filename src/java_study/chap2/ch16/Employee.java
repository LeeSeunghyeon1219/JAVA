package java_study.chap2.ch16;

public class Employee {
    private static int serialNum=1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(String name){
        employeeName=name;
        serialNum++;
        employeeId=serialNum;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
//        serialNum=1000; //이건 사용 가능 -> 메모리가 이미 로드 될 때 있기 때문에
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getSerialNum(){
        int i=0; // 지역변수
//        employeeName="Lee"; //이 메서드가 불러질 시점에 employeeName이 없을 수 없음. 따라서 일반 메서드 변수는 사용할 수 없다.
          return serialNum;
    }
}
/*
static 변수
여러 인스턴스가 공통으로 사용하는 변수를 선언, 공유하는 기준 값이 필요한 경우
static 변수를 두고 여러개의 인스턴스들이 공유함
ex) 학생마다 새로운 학번 생성 / 카드호사에서 카드를 새로 발급할 때 마다 새로운 카드 번호를 부여 / 회사에서 사원이 입사할 때마다 새로운 사번이 필요

static int serialNem;
인스턴스가 생성될 때 만들어지는 변수가 아닌 처음 프로그램에서 메모리에 로딩될 때 메모리 할당
클래스변수, 정적 변수 라고 함(vs 인스턴스 변수)
인스턴스 생성과 상관없이 사용 가능하므로 클래스 이름으로 직접 참조 // 인스턴스와 상관없이 참조하기 떄문에 클래스 이름을 사용한다.

프로그램을 구동시키면 메모리에 올라가게 된다. 이때 상태를 프로세스 라고 한다.
프로세스 자체가 도는 것이 아니라 thread 상태로 돌게 된다.
메모리에 올라가게 될떄 두가지 영역을 가지게 된다.
코드 영역: 명령어 집합(instruction set)
Data/상수/static 영역: 처음부터 메모리를 잡는 데이터들. 상수, Literal, static 변수.
인스턴스는 생성될때마다 사용되는 메모리는 힙메모리라고 하였고, 인스턴스가 사라지는 순간 가비지 컬렉터에의해 수거됨
static 변수는 인스턴스와 다른 데이터 공간에 생성되게 된다. 프로그램이 끝나서 unload 되는 순간 없어지게 된다.ㅇ

static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다
static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있음
인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음

변수의 유효 범위와 메모리
변수의 유효 범위(scope)와 생성과 소멸(life cycle)은 각 변수의 종류마다 다름
지역변수, 멤버 변수, 클래스 변수는 유효범위와 life cycle, 사용하는 메모리도 다름
지역변수(로컬변수): 함수 내부에 선언,함수내부에서만 사용 스택 메모리 사용, 함수가 호출될 때 생성되고 함수가 끝나면 소멸
멤버변수(인스턴스변수): 클래스 멤버변수로 선언, 클래스 내부에서 사용하고, private 아니면 참조 변수로 다른 클래스에서 사용 가능. 힙 메모리 사용. 인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸
static변수(클래스 변수): static 예약어를 사용하여 클래스 내부에 선언. 클래스 내부에서 사용하고, private 아니면 참조 변수로 다른 클래스에서 사용 가능. 데이터 영역 메모리 사용. 프로그램이 처음 시작할 때 상수와 함꼐 데이터 영역에 생성되고 프로그램 끄탄고 메모리를 해제할 떄 소멸

static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음
멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리가 할당됨
상황에 적절하게 변수를 사용해야 함
*/

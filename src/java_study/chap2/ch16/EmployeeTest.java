package java_study.chap2.ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee("이순신");
//        System.out.println(Employee.serialNum); //serialNum을 외부에서 사용하지 못하도록 private로 바꾸어놨기 때문에 에러발생

        Employee employeeKim = new Employee("김유신");

        //static 변수는 인스턴스에서 공통으로 사용하는 영역임음 알 수 있음
        System.out.println(employeeLee.getEmployeeId()+" "+employeeLee.getSerialNum());
        System.out.println(employeeKim.getEmployeeId()+" "+employeeKim.getSerialNum());

        System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());
    }
}
/*
데이터 영역: serialNum
스택 메모리: employeeLee / employeeKim
힙 메모리 employeeLee 인스턴스 / employeeKim 인스턴스스*/
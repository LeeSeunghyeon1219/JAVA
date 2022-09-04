package java_study.chap4.ch02;
class Student implements Cloneable {

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //equal 함수 재정의하기 -> studentId가 같을경우, 같음함수임!
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentId == std.studentId)
                return true;
            else return false;
        }
        return false;

    }

    public String toString() {
        return studentId + "-" + studentName;
    }

    public void setStudentName(String sName){
        this.studentName=sName;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class EqualTest {

    public static void main(String[] args) throws CloneNotSupportedException{
        Student Lee = new Student(100, "Lee");
        Student Shun = new Student(100, "Lee");

        Student Lee1=Lee; //주소값만 넣기 때문에 같다고 결과가 나온다.

        System.out.println(Lee == Shun); //False
        System.out.println(Lee.equals(Shun)); //재정의하여 결과가 True로 나온다.

        //String과 문자열같은 경우에는 hashcode 출력하면 동일하게 나온다.-> 함수를 수정해보자!
        System.out.println(Lee.hashCode());
        System.out.println(Shun.hashCode());

        System.out.println(System.identityHashCode(Lee)); // 재정의전의 진짜 hashcode 출력하는 방법법
        System.out.println(System.identityHashCode(Shun));

        Lee.setStudentName("SS");
        Student copyLee =(Student) Lee.clone();
        System.out.println(copyLee);
    }
}

/*
equals() 메서드
두 인스턴스의 주소 값을 비교하여 true/false를 반환
재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 구현함
인스턴스가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 재정의 할 수 있음
하지만 같은 학번, 같은 사번, 같은 아이디일 경우에는 같은 인스턴스로 봐야 한다. -> 재정의해보자!

인스턴스가 같다
인스턴스를 힙 메모리에 만들게 되면, 메모리를 가르치는 참조변수가 있다. 또다른 인스턴스를 만들면 새로운 힙메모리가 잡히게 된다.
이 힙메모리가 같을 경우, 두 개의 인스턴스가 같다는 의미이다.

hashCode() 메서드
hashCode()는 인스턴스의 저장 주소를 반환함
힙메모리에 인스턴스가 저장되는 방식이 hash 방식
hash: 정보를 저장, 검색하는 자료구조. 자료의 특정 값(키 값)에 대한 저장 위치를 반환해주는 해시 함수를 사용
두 인스턴스가 같다는 것은?: 두 인스턴스에 대한 equals()의 반환 값이 true
동일한 hashCode() 값을 반환
논리적으로 동일함을 위해 equals() 메서드를 재정의 하였다면 hashCode()메서드도 재정의 하여 동일한 hashCode 값이 반환되도록 한다

clone() 메서드
객체의 원본을 복제하는데 사용하는 메서드
생성과정의 복잡한 과정을 반복하지 않고 복제 할 수 있음
clone()메서드를 사용하면 객체의 정보(멤버 변수 값등...)가 동일한 또 다른 인스턴스가 생성되는 것이므로, 객체 지향 프로그램에서의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음
해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해 줌
*/
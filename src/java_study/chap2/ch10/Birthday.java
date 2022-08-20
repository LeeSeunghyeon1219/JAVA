package java_study.chap2.ch10;

public class Birthday {

    //은 클래스 내부에서만 접근 가능(외부 클래스, 상속 관계의 클래스에서도 접근 불가)
    private int day;
    private int month;
    private int year;

    private boolean isValid;


    public void setMonth(int month) {
        if(month<1||month>12) {
            isValid = false;
        }
        else{
            isValid = true;
            this.month = month;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day){
        this.day=day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay(){
        return day;
    }

    public void showDate()
    {
        if(isValid){
            System.out.println(year+"/"+month+"/"+day);
        }
        else{
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
/*
접근제어 지시자
클래스 외부에서 클래스의 멤버변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
private: 같은 클래스 내부에서만 접근 가능(외부 클래스, 상속 관계의 클래스에서도 접근 불가)
아무것도 없음(default): 같은 패키지 내부에서만 접근 가능 (상속 관계라도 패키지가 다르면 접근 불가)
protected:같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
public: 클래스의 외부 어디서나 접근 할 수 있음
(public > default > protected > private)

get()/ set() 메서드
private으로 제어한 멤버 변수도 public 메서드가 제공되면 접근 가능하지만
변수가 public으로 공개되었을 때보다 private 일때 각 변수에 대한 제한을 public 메서드에서 제어 할 수 있다.
객체 지향 프로그램에서 정보 은닉은 필요한 외부에서 접근 가능한 최소한의 정보를 오픈함으로써 객체의 오류를 방지하 클라이언트 객체가 더 효율적으로 객체를 활용할 수 있도록 해준다.

* 패키지의 역할: 소스의 묶음. 다른 패키지에 있는 걸 사용할 때에는 import 해서 사용한다.
*/

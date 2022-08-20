package java_study.chap2.ch08;

public class OrderTest {
    public static void main(String[] args) {

        // default 생성자 사용
        Person personT = new Person();
        personT.name = "Tomas";
        personT.age = 37;
        personT.height = 180;
        personT.weight = 78;
        personT.gender = "남성";

        personT.showPersonInfo();

        // 생성한 생성자 사용하기
        Order OrderT = new Order("202011020003","01023450001","서울시 강남구 역삼동 111-333","20201102","130258",35000,"0003");
        OrderT.showOrderDetail();
    }
}

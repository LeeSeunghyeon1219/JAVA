package java_study.chap2.ch11;

public class MakeReport {

    // String 클래스를 쭉 이어서 쓰는 방법. 더하기를 할 경우에는 메모리 버퍼가 일어날 수 있다.
    StringBuffer buffer = new StringBuffer();

    private String line = "===========================================\n";
    private String title = "  이름\t   주소 \t\t  전화번호  \n";

    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter() {
        buffer.append(line);
    }

    // 이함수를 제외한 나머지는 클라이언트에서 필요가 없다
    public String getReport() {
        makeHeader(); //위에 해더 찍고 -> 외부에서 쓸 수 없음
        generateBody(); // 본문 찍고 -> 외부에서 쓸 수 없음
        makeFooter(); // 마지막 줄 찍고 -> 외부에서 쓸 수 없음
        return buffer.toString();
    }

}
/*
정보은닉을 활용한 캡슐화
꼭 필요한 정보와 기능만 외부에 오픈
대부분의 멤버변수와 메서드를 감추고 외부에 통합된 인터페이스만을 제공함으로써 일관된 기능을 구현하게 함
각각의 메서드나 멤버면수를 접근함으로써 발생하는 오류를 최소화한다.
클라이언트가 제어할 수 있는 것이 적기 때문에 한정적이다.
*/

package java_study.chap4.ch03;

public class StringTest {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); //false -> 힙메모리에 생성되서 따로 생성됨

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);

        //String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java)); //문자열의 다른 주소로 가르키게 된다.

        // concat을 계속 할 경우 메모리 가비지 현상이 일어남
        // 해결방법: StringBuilder나 StringBuffer 사용하기!
        String java1 = new String("java");
        String android1 = new String("android");

        StringBuilder buffer = new StringBuilder(java1);
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android1);
        System.out.println(System.identityHashCode(buffer));


        String strBlock = """
				This 
				is 
				text
				block
				test.""";
        System.out.println(strBlock);

        System.out.println(getBlockOfHtml());

    }
    public static String getBlockOfHtml() {
        return """
		            <html>

		                <body>
		                    <span>example text</span>
		                </body>
		            </html>""";

    }

}

/*
String 클래스
String str1 = new String("abc"); // 인스턴스로 생성하는데 같아짐
String str2 = "abc"; // 상수풀에 "abc" 생성후 str2가 가리킴
힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법
힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
한번 생성된 String은 불변(immutable)// final로 선언되어 있음
String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨
-> 메모리 가비지가 많이 생김(메모리낭비)
-> StringBuilder, StringBuffer 활용하기

StringBuilder, StringBuffer 활용하기
내부적으로 가변적인 char[]를 멤버 변수로 가짐
문자열을 여러번 연결하거나 변경할 때 사용하면 유용함
새로운 인스턴스를 생성하지 않고 char[] 를 변경함
StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)을 보장
단일 쓰레드에서는 StringBuilder / 멀티 쓰레드 상황에서는 String Builder 사용하기!
toString() 메서드로 String반환

text block 사용하기 (java 13)
문자열을 """ """ 사이에 이어서 만들 수 있음
html, json 문자열을 만드는데 유용하게 사용할 수 있음
 */
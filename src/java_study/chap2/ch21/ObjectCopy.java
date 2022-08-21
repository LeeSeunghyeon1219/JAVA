package java_study.chap2.ch21;

public class ObjectCopy {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibaray = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        //자바 arrayCopy 함수 사용하기(얕은 복사)
        System.arraycopy(library, 0, copyLibaray, 0, 5);

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("======library=========");
        for( Book book : library) {
            book.showBookInfo();
        }

        System.out.println("======copy library=========");

        for( Book book : copyLibaray) {
            book.showBookInfo();
        }
    }

}
/*
객체 배열 복사하기
얕은 복사(ObjectCopy.java)
System.arrayCopy(src, srcPos, dest, destPos, length) 사용
객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정 됨
즉, 두 배열이 같은 객체를 가리킴 -> 값을 변경하면 원래 배열, 복사된 배열 값이 같이 바뀌게 된다

깊은 복사(ObjectCopy2.java)
각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함
 */
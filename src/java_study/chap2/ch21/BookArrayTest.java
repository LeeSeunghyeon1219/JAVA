package java_study.chap2.ch21;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5]; // 객체 배열: 객체의 주소가 들어갈 메모리만 할당되고 각 요소 객체는 생성해줘야 한다.

        library[0] = new Book("가", "A");
        library[1] = new Book("나", "B");
        library[2] = new Book("다", "C");
        library[3] = new Book("라", "D");
        library[4] = new Book("마", "E");

        for (int i = 0; i < library.length; i++) {
//            System.out.println(library[i]); // 객체의 메모리 주소위치만 출력됨
            library[i].showBookInfo();
        }
    }
}
/*
객체 배열 선언과 구현
기본 자료형 배열은 선언과 동시에 배열의 크기만큼의 메모리가 할당되지만,
객체 배열의 경우엔 요소가 되는 객체의 주소가 들어갈(4바이트, 8바이트) 메모리만 할당되고(null) 각 요소 객체는 생성하여 저장해야 함
*/
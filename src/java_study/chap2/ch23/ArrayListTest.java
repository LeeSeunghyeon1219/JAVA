package java_study.chap2.ch23;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Book> library = new ArrayList<>();  //ArrayList 선언해줌

        library.add(new Book("가", "A"));
        library.add(new Book("나", "B"));
        library.add(new Book("다", "C"));
        library.add(new Book("라", "D"));
        library.add(new Book("마", "E"));

        for(int i =0; i<library.size(); i++) {
            library.get(i).showBookInfo();
        }


    }

}
/*
객체 배열을 구현한 클래스 ArrayList
java.util 패키지에서 제공
기존의 배열 선언과 사용 방식은 배열의 길이를 정하고 요소의 개수가 배열의 길이보다 커지면 배열을 재할당하고 복사해야 했음
배열의 요소를 추가하거나 삭제하면 다른 요소들의 이동에 대한 구현을 해야 함
ArrayList는 객체 배열을 좀더 효율적으로 관리하기 위해 자바에서 제공해 주는 클래스
이미 많은 메서드들이 최적의 알고리즘으로 구현되어 있어 각 메서드의 사용 방법만 익히면 유용하게 사용할 수 있음

ArrayList 주요 메서드
boolean add(E e): 요소하나를 배열에 추가. E는 요소의 자료형을 의미
int size(): 배열에 차가된 요소 전체 개수를 반환
E get(int index): 배열의 index 위치에 있는 요소 값을 반환
E remove(int index): 배열의 index 위치에 있는 요소의 값을 제거하고 그 값을 반환
boolean isEmpty(): 배열에 비어있는지 확인
*/
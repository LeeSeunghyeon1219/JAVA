package java_study.ch20;

public class NestedLoopTest {

    public static void main(String[] args) {
        int dan = 2;
        int count = 1;

        // 이중반복문 ->for문 사용하기
        for( dan = 2; dan <= 9; dan++) {
            for(count = 1; count <=9; count++)
                System.out.println( dan + "X" + count + "=" + dan * count);
            System.out.println();
        }

        //이중반복문 -> while문 사용하기
        dan = 2;
        while( dan <= 9 ) {
            count = 1;
            while (count <= 9) {
                System.out.println( dan + "X" + count + "=" + dan * count);
                count++;
            }
            dan++;
            System.out.println();
        }
    }
}
/*
중첩반복문
반복문 내부에 또 다른 반복문이 있음
여러 겹으로 반복문 겹쳐서 구현 가능. 단 수행시간에 문제 발생할 수 있음
외부 반복문과 내부 반복문간의 변수 값 변화에 유의하면 구현하여야 함
*/
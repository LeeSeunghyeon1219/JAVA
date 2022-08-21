package java_study.chap2.ch20;

public class CharArrayTest {

    public static void main(String[] args) {

        char[] alpahbets = new char[26];
        char ch = 'A';

        for(int i = 0; i<alpahbets.length; i++) {

            alpahbets[i] = ch++;
        }

//        for(int i = 0; i<alpahbets.length; i++) {
//            System.out.println(alpahbets[i] +","+ (int)alpahbets[i]);
//        }

        // 위의 주석처리한코드와와 아래와 동리한 코드
       for(char alpha : alpahbets){
            System.out.println(alpha+","+(int)alpha);
        }

    }


}
/*
배열
동일한 자료형의 순차적 자료 구조
인덱스 연산자 []를 이용하여 빠른 참조가 가능
물리적 위치와 논리적 위치가 동일
배열의 순서는 0부터 시작
자바에서는 객체 배열을 구현한 ArryList를 활용함

배열 선언
int[] arr1 = new int[10];
int arr2[] = new int[10];

배열 초기화
int[] numbers = new int[] {10, 20, 30};  //개수 생략해야 함
int[] numbers = {10, 20, 30};            // new int[]  생략 가능
int[] ids;
ids = new int[] {10, 20, 30};            // 선언후 배열을 생성하는 경우는 new int[] 생략할 수 없음

배열 사용하기
[] 인덱스 연산자 활용 - 배열 요소가 저장된 메모리의 위치를 연산하여 찾아 줌

객체 배열도 있다.

배열의 길이와 요소의 개수는 동일하지 않습니다.
배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이타)가 없는 경우도 있음 (100개를 잡았어도, 5개만 쓸 수 있다)
배열의 length 속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다름
length를 활용하여 오류가 나는 경우

향상된 for문 사용하기: 배열의 n개 요소를 0 부터 n-1까지 순차적으로 순회할 때 간단하게 사용할 수 있음
for( 변수 : 배열) {

}

*/

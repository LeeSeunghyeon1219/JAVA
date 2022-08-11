package java_study.chap1.ch19;

public class ForTest {

    public static void main(String[] args) {

        int count =1;
        int sum = 0;

        for( int i = 0 ; i<10; i++, count++) {  //10번
            sum += count;
            //count++;
        }
        System.out.println(sum);


        int num = 1;
        int total = 0;

        while( num <= 10) {
            total += num;
            num++;
        }
        System.out.println(total);
    }
}
/*
for 문
구조: for(초기화식, 조건식, 증감식){수행문;} // 초기값이 조건식이 될 때까지 반복(증감식을 통해서 증가/감소됨)
for문은 초기화식, 조건식, 증감식이 생략이 가능하다.
초기화식 생략: 이미 이전에 값이 초기화되어 for 내부에서 값을 지정할 필요 x
조건식 생략: 반복수행에 대한 조건이 수행문 내부에 있는 경우
증감식 생략: 증감식에 대한 연산이 복잡하거나 다른 변수의 연산 결과값에 결정되는 경우
무한 반복 for(;;){}

각 반복문은 주로 언제 사용하는가?
while문: 조건이 참인 동안 반복 수행, 조건이 맞지않으면 수행 x. 조건 결과나 변수가 true, false인 경우 사용
do-while문: 조건이 참인 동안 반복 수행. 수행문을 먼저 수행 -> 조건 체크. 조건식 결과나 변수가 true, false 값인 경우 사용
for문: 초기화, 조건체크, 증감순으로 수행. 특정수의 범위, 횟수와 관련하여 반복되는 경우 주로 사용. 배열과 함께 사용


*/

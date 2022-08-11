package java_study.chap1.ch21;

public class BreakTest {

    public static void main(String[] args) {

        int sum = 0;
        int num;
        for( num = 1; ; num++) {
            sum += num;
            if( sum >= 100)
                break;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
/*
break문 사용하기
감싸고 있는 제어문의 블록을 빠져나옴
switch문에서도 사용
반복문에서 주로 조건 if 와 같이 사용하여 조건에 해당되는경우 반복수행을 멈추고 반복문 외부로 수행이 이동
여러 반복문이 중첩되어 있는 경우엔 break문이 포함되어 있는 반복문만 빠져나옴
*/
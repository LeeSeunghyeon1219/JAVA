package java_study.chap1.ch12;

public class ShortCircuit {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
        System.out.println(value); //false
        System.out.println(num1); //20
        System.out.println(i); //2

        value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
        System.out.println(value); //true
        System.out.println(num1); //3
        System.out.println(i); //4

    }
}
/*
논리 곱(&&)은 두 항의 결과가 모두 true일 때만 결과가 true -> 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음
논리 합(||)은 두 항의 결과가 모두 false일 때만 결과가 false -> 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음
*/

package java_study.chap1.ch07;

public class DoubleTest {
    public static void main(String[] args){
        double dnum=3.14;
        float fnum=3.14f; // float형은 뒤에 f 를 붙여야 에러가 안난다.

        System.out.println(dnum);
        System.out.println(fnum);

        double dnum1=1;
        for(int i=0;i<10000;i++){
            dnum1=dnum1+0.1;
        }
        System.out.println(dnum1);
        //지수와 가수로 나타내는 부동소수점 방식에서 지수부가 0을 표현할수 없기 때문에 약간의 오차가 발생할 수 있다.
        //결과 => 1001.000000000159으로 나옴
    }
}

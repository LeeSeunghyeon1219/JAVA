package java_study.chap1.ch06;

public class Variable_Test {
    public static void main(String[] args) {
        byte bnum=127;
        System.out.println(bnum);

        //byte bnum1=128; // 에러 발생함->byte는 -128~127까지 입력 가능

        //int num=12345678900; // 에러 발생 -자리수를 못담아넣음
        long lnum=12345678900l; // long type를 쓰기 위해서는 맨 끝에 l을 붙여줘야 한다.
        System.out.println(lnum);
    }
}
/*
기본 자료형(바이트수)
정수형: byte(1), short(2), int(4), long
문자혀: char (2)
*/
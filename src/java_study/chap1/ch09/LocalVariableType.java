package java_study.chap1.ch09;

public class LocalVariableType {
    public static void main(String[] args){
        var i = 10;
        var j=10.0;
        var str="hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str="test";
        System.out.println(str);

//        str=5 // 이건 되지 않는다(이유: 한번 선언하면 다른 타입의 값은 대입 불가능!)

    }

}
/*
지역 변수 자료형 없이 사용하기 (자바 10 부터 지원됨, 지역변수만 사용)->Local variable type inference
추론 가능한 변수에 대한 자료형을 선언하지 않는다.
한번 선언하면 추론된 변수는 다른타입의 값을 대입할 수 없다.
지역 변수만 사용 가능하다.
- 지역변수: 블록 안에서 사용되는 변수, 함수 안에서 사용하는 변수, main에서 넘어오는 매개변수
- 맴버변수, 스태틱변수 등

*/
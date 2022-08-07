package java_study.ch10;

public class TypeConversion {
    public static void main(String[] args) {

        // 묵시적 형변환 예시
        byte bNum = 10;
        int i = bNum;

        int i1 = 20;
        float f = i1;

        // 명시적 형변환 예시
        int i2 = 10;
        byte b = (byte)i2; //int(4byte) > byte(1byte)이므로 명시적 변환

        double d = 3.14;
        int i3 = (int)d; //double(8byte, 실수) > int(4 byte)이므로 명시적 변환

        //코드 예시
        double dNum=1.2;
        float fNum=0.9f;
        int iNum1=(int)dNum+(int)fNum; // 명시적 형 변환(dNum->int / fNum -> int)
        int iNum2=(int)(dNum+fNum);

        System.out.println(iNum1);
        System.out.println(iNum2);

    }
}
/*
형변환
- 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
- 묵시적 형 변환(explicit type conversion, 자동 형 변환)과 명시적 형 변환(implicit type conversion, 강제 형 변환)이 있음
- 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환 / 덜 정밀한 자료형에서 더 정밀한 자료형으로읜 형 변환은 자동으로 이루어 짐
*/
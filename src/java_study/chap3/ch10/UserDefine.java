package java_study.chap3.ch10;

public class UserDefine {
    public static void main(String[] args){
        System.out.println(Define.GREETING);
        System.out.println(Define.MIN);
        System.out.println(Define.MAX);
        System.out.println(Define.MATH_CODE);
        System.out.println(Define.CHEMISTRY_CODE);
        System.out.println("원주률은" + Define.PI + "입니다.");

        Define.result_print("석돌이");
    }
}

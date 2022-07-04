package java_study.ch04;

public class Binary_Test {

    public static  void main(String[] args){
        int Num=10;
        int bNum=0B1010; // 뒤에나오는 숫자는 바이너리임(1010=10)
        int oNum=012; // 뒤에나오는 숫자는 8진수임(12=10)
        int xNum=0XA; // 뒤에 나오는 숫자는 16진수임

        System.out.println(Num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);

    }
}

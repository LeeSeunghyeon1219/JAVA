package java_study.chap2.ch20;

public class ArrayTest {
    public static void main(String[] args){
        int[] arr = new int[10];
        int total = 0;

        for(int i=0, num=1; i< arr.length; i++, num++) {
            arr[i] = num;
            System.out.print(arr[i]+" ");
        }

        for( int i =0; i<arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);

    }
}

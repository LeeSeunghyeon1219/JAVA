package java_study.chap3.ch15;

interface X {
    void x();
}
interface Y {
    void y();
}
interface MyInterface extends X, Y{
    void myMethod();
}

class MyClass implements MyInterface{
    @Override
    public void x() {
        System.out.println("x()");
    }
    @Override
    public void y() {
        System.out.println("y()");
    }
    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }
}

public class MyClassTest {

    public static void main(String[] args) {

        MyClass mClass = new MyClass();

        X xClass = mClass;
        xClass.x();


        Y yClass = mClass;
        yClass.y();

        MyClass iClass = mClass;
        iClass.x();
        iClass.y();
        iClass.myMethod();
    }

}


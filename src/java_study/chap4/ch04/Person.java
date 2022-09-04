package java_study.chap4.ch04;

public class Person {

    private String Name;
    private int age;
    public Person(){}
    public Person(String name, int age){
        this.Name=name;
        this.age=age;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

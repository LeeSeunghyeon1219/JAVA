package java_study.chap4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException,
            ClassNotFoundException, NoSuchMethodException, SecurityException, InvocationTargetException {

        Person person = new Person("James",20);
        System.out.println(person);

        Class c1 = Class.forName("java_study.chap4.ch04.Person");  //
        Person person1 = (Person)c1.newInstance();
        person1.setName("강아지");
        System.out.println(person1);

        Class c2=person.getClass();
        Person p =(Person) c2.newInstance();
        System.out.println(p);
    }
}

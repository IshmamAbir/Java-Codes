package Overriding;

public class Person {
    String name="Ishmam";
    int age=21;

    void showInfo(){
        System.out.println("name="+name);
        System.out.println("age="+age);
    }
    Person(){
        System.out.println("Person constructor");
    }
}

package Overriding;

public class Teacher extends Person{
    String name="Abir";
    int age=25;
    String qualification="BSc in CSE";

    @Override
    void showInfo(){
        super.showInfo();
        System.out.println("name="+super.name);
        System.out.println("age="+age);
        System.out.println("Qualification= "+qualification);
    }

    Teacher(){
        super();
        System.out.println("Teacher constructor");
    }
}

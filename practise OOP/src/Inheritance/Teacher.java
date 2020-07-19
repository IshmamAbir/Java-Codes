package Inheritance;

public class Teacher extends Person{
    String designation;

    void showInfo2(){
        showInfo1();
        System.out.println("Designation="+designation);
    }
}

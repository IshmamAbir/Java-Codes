package static_variable_practise;

import com.company.Teacher;

public class Student {
    String name;
    static int count=0;
    int id;

    Student(){
        count++;
    }

    static void display2(){
        System.out.println("Call from static method");
    }

    void display(){
        System.out.println("Total student = "+this.count);
    }
}

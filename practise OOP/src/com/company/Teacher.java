package com.company;

public class Teacher {

    String name,gender;
    int number;

    void displayTeachersInfo(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(number);
    }

    Teacher(String m,String n,int o){
        this.name=m;
        this.gender=n;
        this.number=o;
        System.out.println("call from parameterized constructor");
    }

    Teacher(){
        System.out.println("call from default constructor");
    }

}

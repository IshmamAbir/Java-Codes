package Syayic_keyword;

public class Student {
    String name;
    int id;
    static String uniName="IIUC";


    Student(String m,int n){
        this.name=m;
        this.id=n;
    }

    void displayInfo(){
        System.out.println("Name= "+this.name);
        System.out.println("ID= "+this.id);
        System.out.println("University= "+this.uniName);
    }

}

package Syayic_keyword;

public class test {
    public static void main(String[] args) {
        Student st1=new Student("Abir",57);
        st1.displayInfo();

        System.out.println("\n\n");

        Student st2=new Student("Ishmam",1156);
        st2.displayInfo();

        System.out.println("\n\n");

        System.out.println("static variable - "+ Student.uniName );


    }
}

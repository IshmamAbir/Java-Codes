package static_variable_practise;

public class test {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.display();
        Student st2 = new Student();
        st2.display();
        Student st3 = new Student();
        st3.display();

        Student.display2();
        System.out.println(Student.count);



    }
}

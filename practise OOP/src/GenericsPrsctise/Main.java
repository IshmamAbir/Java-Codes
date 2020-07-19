package GenericsPrsctise;

public class Main {
    public static void main(String[] args) {
        MyClass<Integer,Double> ob = new MyClass<>();
        ob.name=5;
        ob.name2=(double)7;
        System.out.println(ob);
        System.out.println();
        System.out.println(ob.mult());

        System.out.println(ob.check(ob.name2));
    }
}

package ToString;

public class Test {
    String name;
    int age;

    public Test(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return "Name="+name+"\n"+"age="+age;
    }
}

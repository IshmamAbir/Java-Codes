package GenericsPrsctise;

public class MyClass<T extends Number,S extends Number> {
    T name;
    S name2;

public String toString(){
    return name +" "+name2;
}

int mult(){
    return name.intValue() * (int) name2.doubleValue();
}
boolean check(S name){
    if (this.name == name)
        return true;
    return false;
}
}

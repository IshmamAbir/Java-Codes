package LambdaExpressiom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        class Person{
            public String name;
            public int age;

            public Person(String pName,int pAge){
                this.name= pName;
                this.age = pAge;
            }

            @Override
            public String toString(){

                return name ;
            }
        }
        Person[] peopleArr= {
                new Person("abir",23),new Person("Ishmam",25),new Person("Cjy",29),new Person("Chy",25)
        };

        ArrayList<Person> people =new ArrayList<>(Arrays.asList(peopleArr));


        people.stream()
                .filter(person -> (person.age)>=25)
                .collect(Collectors.toList()).forEach(person -> System.out.println(person.name +" "+person.age));

        System.out.println();

        people.stream().forEach(i -> System.out.println(i.name +" " +i.age));

        System.out.println();

        Map<Integer, List<Person>> groupedPerson = people.stream().collect(Collectors.groupingBy(person -> person.age));
        System.out.println(groupedPerson.toString());
    }
}

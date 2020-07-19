package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] employees={
                new Employee("abir", 1, "12345", "ctg", "java bank", "IDEA branch", 8083, "server Type"),
                new Employee("Ishmam", 2, "6544322", "dhk", "java bank", "IDEA branch", 8083, "server Type"),
                new Employee("FAhad mtu", 3, "4322", "bogra", "java bank", "IDEA branch", 8083, "server Type"),
                new Employee("Tajbir", 4, "65322", "dinajpur", "java bank", "IDEA branch", 8083, "server Type"),
                new Employee("Faisal", 5, "9086544322", "rajshahi", "java bank", "IDEA branch", 8083, "server Type"),
                new Employee("hasnat", 6, "0965443", "khulna", "java bank", "IDEA branch", 8083, "server Type"),
        };

        ArrayList<Employee> list=new ArrayList<>(Arrays.asList(employees));
        list.forEach(employee -> {
            System.out.println(employee);
            System.out.println();
        });
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	Teacher teacher1 = new Teacher();

	teacher1.name= "Ishmam Abir";
	teacher1.gender="maal";
	teacher1.number=6968768;

	teacher1.displayTeachersInfo();

	System.out.println("\n\n");
	Teacher teacher2=new Teacher("Abir","male", 35536365);

		teacher2.displayTeachersInfo();
    }
}

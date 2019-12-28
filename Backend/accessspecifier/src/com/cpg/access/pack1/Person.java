package com.cpg.access.pack1;

public class Person {
public int age;
public static String name;
public Person(int a) {
	this.age = a;
}
public void personDetails() {
	System.out.println("age is "+age);
}
public static void personName() {
	name = "susmita";
	System.out.println(" name of person is "+name);
}
}

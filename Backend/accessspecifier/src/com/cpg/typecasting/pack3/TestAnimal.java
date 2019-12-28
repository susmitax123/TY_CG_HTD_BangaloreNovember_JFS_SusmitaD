package com.cpg.typecasting.pack3;

public class TestAnimal {
public static void main(String args[]) {
	Animal a1 = new Animal();
	a1.eat();
	System.out.println("---------");
	Animal a2 = new Dog();
		a2.eat();
		System.out.println("-------");
    Dog d1 = (Dog)a2;
    d1.walk();
    System.out.println("---------");
    Lion l1 = new Lion();
    l1.eat();
    System.out.println("---------");
    Animal a3 = new Lion();
    a3.eat();
    System.out.println("-------");
    Lion l2 = (Lion)a3;
    l2.run();
}
}

package com.cpg.typecasting.pack3;

public class Animal {
void eat() {
	System.out.println("eating");
}

}

class Lion extends Animal{
public void run() {
	System.out.println("running");
}
}

class Dog extends Animal{
  public void walk() {
		System.out.println("walking");
		
	}
}
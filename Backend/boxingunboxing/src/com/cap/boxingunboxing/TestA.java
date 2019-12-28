package com.cap.boxingunboxing;

public class TestA {
public static void main(String[] args) {
	int i1 = 10;
	//Boxing
	Integer i2 = new Integer(i1);
	//Unboxing
	int i3 = i2.intValue();
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(i3);
	double d1 =10.2;
	//Boxing
	Double d2 = new Double(d1);
	//Unboxing
	double d3 = d2.doubleValue();
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
}
}

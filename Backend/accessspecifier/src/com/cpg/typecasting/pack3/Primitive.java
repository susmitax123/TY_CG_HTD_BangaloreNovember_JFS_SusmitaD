package com.cpg.typecasting.pack3;

public class Primitive {
byte b = 10;
short s = b;
int i = b;
long l = b;
float f = b;
double d = b;

double dou = 1.11;
byte b2 = (byte)dou;
short s2 = (short)dou;
int i2 = (int)dou;
long l2 = (long)dou;
float f2 = (float)dou;
public void type() {
	System.out.println("byte "+b);
	System.out.println("short "+s);
	System.out.println("integer "+i);
	System.out.println("long "+l);
	System.out.println("float "+f);
	System.out.println("double "+d);
	System.out.println("----------");
	System.out.println("short "+s2);
	System.out.println("byte "+b2);
	System.out.println("int "+i2);
	System.out.println("long "+l2);
	System.out.println("float "+f2);
}
}

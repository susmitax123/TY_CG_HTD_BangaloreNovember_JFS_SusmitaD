package com.cpg.access.pack2;
import com.cpg.access.pack1.*;
public class TestStudent extends Student {
protected TestStudent(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
void studentDetails() {
	System.out.println("name is "+name);
}

public static void main(String args[]) {
	TestStudent s1 = new TestStudent("Ravan");
	s1.studentDetails();
	s1.studDetails();
}
}

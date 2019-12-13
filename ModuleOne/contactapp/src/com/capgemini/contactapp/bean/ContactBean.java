package com.capgemini.contactapp.bean;

import java.io.Serializable;

public class ContactBean implements Serializable{
private String name;
private int number;
private String group1;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getGroup1() {
	return group1;
}
public void setGroup1(String group1) {
	this.group1 = group1;
}

}

package com.capgemini.contactapp.main;

import java.util.Scanner;

import com.capgemini.contactapp.bean.ContactBean;
import com.capgemini.contactapp.dao.ContactDAOImpl;

public class ContactDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactDAOImpl contactDAO = new ContactDAOImpl();

		while(true) {
			System.err.println("Print 1 to show all contacts");
			System.err.println("Print 2 to search for contact by using name");
			System.err.println("Print 3 to operate on contact");
			ContactBean bean = new ContactBean();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				contactDAO.getAllContact();


				break;
			case 2:
				System.out.println("Press 1 to call");
				System.out.println("Press 2 to message");
				System.out.println("Press 3 to go back to main menu");
				int choice3 = sc.nextInt();
				switch (choice3) {

				case 1:
					System.out.println("Calling....");
					System.out.println("Do you want to end the call now? Yes/No");
					String s1 = sc.next();
					break;
				case 2:
					System.out.println("Type message..");
					String s = sc.next();
					System.err.println("sending....");
					break;
				case 3:

					break;
				default:
					break;
				}
				break;
			case 3:
				System.out.println("Press 1 to add contact");
				System.out.println("Press 2 to delete contact");
				System.out.println("Press 3 to edit contact");
				int choice2 = sc.nextInt();
				switch (choice2) {
				case 1:
					System.out.println("Enter the name");
					String name = sc.next();
					System.out.println("Enter number");
					int number = sc.nextInt();
					System.out.println("Enter group");
					String group1 = sc.next();
					bean.setName(name);
					bean.setNumber(number);
					bean.setGroup1(group1);
					contactDAO.addContact(bean);
					break;
				case 2:
					System.out.println("Enter the name you want to delete");
					String name1 = sc.next();
					contactDAO.deleteContact(name1);
					break;
				case 3:
					
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
		}
	}
}

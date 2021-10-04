package exams;

import classes.Contact;
import classes.Temp;

public class Exam_01 {
	public static void main(String[] args) {
		Contact[] contacts = new Contact[] {
				new Contact(1001,"Susan","01012341234"),
				new Contact(1002,"Tom","01091233219"),
				new Contact(1003,"Jack","01015242314")
		}; 

		/*
		 * for(int i = 0; i<contacts.length; i++) {
		 * System.out.println(contacts[i].getId() + " " + contacts[i].getName() + " " +
		 * contacts[i].getContact()); }
		 */
		for(int i = 0; i< contacts.length;i++) {
			if(contacts[i].getName().equals("Tom")) {
				System.out.println(contacts[i].getContact());
			}
		}		

		Contact c = new Contact();

		for(int i = 0;i<contacts.length;i++) {
			if(contacts[i].getId()==(1003)) {
				contacts[i].setContact("01011112222");
				System.out.println(contacts[i].getContact());
			}
		}
	}
}

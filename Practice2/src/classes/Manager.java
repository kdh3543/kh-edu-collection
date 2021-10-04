package classes;

import java.util.ArrayList;

public class Manager {
	private ArrayList stu = new ArrayList();
	
	public void addStu(Student s) {
		this.stu.add(s);
	}
	
	public ArrayList getStu() {
		return stu;
	}
}

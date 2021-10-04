package classes;

import java.util.ArrayList;

public class StudentManager {
	private ArrayList students = new ArrayList();
	
	public void addStudent(Student s) {
		this.students.add(s);
	}
	
	public ArrayList getStudents() {
		return students;
	}
}

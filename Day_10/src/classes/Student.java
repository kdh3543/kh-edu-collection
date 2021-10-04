package classes;

public class Student {
	private int id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(int id, String name, int kor, int eng, int math) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void print() {
		System.out.println(id + " " + name + " " + kor + " " + eng + " " + math);
	}
}

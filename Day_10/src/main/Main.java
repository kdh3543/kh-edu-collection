package main;

import classes.Book;
import classes.Student;
import classes.Tv;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Tv lg = new Tv();
		
		lg.setChannel(10);
		System.out.println(lg.getChannel());
		
		Book bo = new Book(1001,"�ι̿��� �ٸ���", 14000);
		
		Book bo1 = new Book(1002,"�����ϱ� û���̴�",15000); // �����ε�
		Book bo2 = new Book(); // �����ε�
		
		
		
		Student stu1 = new Student(1001,"Jack",90,60,80);
		
		Student stu2 = new Student(1002,"Jane",80,90,70);
		
		stu1.print();
		stu2.print();
		
		/*
		 * stu.setId(1001); stu.setName("Jack"); stu.setKor(90); stu.setEng(60);
		 * stu.setMath(80);
		 * 
		 * Student stu2 = new Student(); stu2.setId(1002); stu2.setName("Jane");
		 * stu2.setKor(80); stu2.setEng(90); stu2.setMath(70);
		 * 
		 * System.out.println("Jack �л��� ���� : " + stu.getSum());
		 * System.out.println("Jack �л��� ��� : " + stu.getAvg());
		 * 
		 * System.out.println("Jane �л��� ���� : " + stu2.getSum());
		 * System.out.println("Jane �л��� ��� : " + stu2.getAvg());
		 */
	}
}

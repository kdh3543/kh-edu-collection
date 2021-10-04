package main;

import classes.Book;
import classes.Student;
import classes.Tv;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Tv lg = new Tv();
		
		lg.setChannel(10);
		System.out.println(lg.getChannel());
		
		Book bo = new Book(1001,"로미오와 줄리엣", 14000);
		
		Book bo1 = new Book(1002,"아프니까 청춘이다",15000); // 오버로딩
		Book bo2 = new Book(); // 오버로딩
		
		
		
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
		 * System.out.println("Jack 학생의 총점 : " + stu.getSum());
		 * System.out.println("Jack 학생의 평균 : " + stu.getAvg());
		 * 
		 * System.out.println("Jane 학생의 총점 : " + stu2.getSum());
		 * System.out.println("Jane 학생의 평균 : " + stu2.getAvg());
		 */
	}
}

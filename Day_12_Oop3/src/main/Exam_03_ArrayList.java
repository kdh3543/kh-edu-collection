package main;

import java.util.ArrayList;
import java.util.Vector;

public class Exam_03_ArrayList {
	public static void main(String[] args) {
		
		// byte -> Byte, short -> Short, int -> Integer, double -> Double
		
		// Object : �ڹٿ� �����ϴ� ��� Ŭ������ �ְ� ����
		// ==> Object �ȿ��� � �����͵� Ŭ������ �� �� �� ����
		
		// ����
		ArrayList arr = new ArrayList();
		arr.add("Hello");
		arr.add("Java");
		arr.add("World");

		// ���
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("----------------------");
		
		// ����
		arr.remove(0);

		// ���
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println("----------------------");

		// ����
		arr.add(0, "Good");

		// ���
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("----------------------");

	}
}

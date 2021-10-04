package main;

import java.util.ArrayList;
import java.util.Vector;

public class Exam_03_ArrayList {
	public static void main(String[] args) {
		
		// byte -> Byte, short -> Short, int -> Integer, double -> Double
		
		// Object : 자바에 존재하는 모든 클래스의 최고 조상
		// ==> Object 안에는 어떤 데이터든 클래스든 다 들어갈 수 있음
		
		// 삽입
		ArrayList arr = new ArrayList();
		arr.add("Hello");
		arr.add("Java");
		arr.add("World");

		// 출력
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("----------------------");
		
		// 삭제
		arr.remove(0);

		// 출력
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println("----------------------");

		// 삽입
		arr.add(0, "Good");

		// 출력
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("----------------------");

	}
}

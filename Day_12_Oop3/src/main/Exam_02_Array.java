package main;

public class Exam_02_Array {
	public static void main(String[] args) {
		
		// �Է�
		String[] arr = new String[3];
		arr[0] = "Hello";
		arr[1] = "Java";
		arr[2] = "World";
		
		// ���
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println("=================");
		// ����
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = null;
		
		// ���
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
				
		System.out.println("=================");
		// ����
		arr[2] = arr[1];
		arr[1] = arr[0];
		arr[0] = "Good";
		
		// ���
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
				
	}
}

package exams;

public class Exam_01 {
	public static void main(String[] args) {
		/*
		 * int a; int b; int c; int d; int e; // 변수를 대량으로 생성할 때는 하나하나 다 선언 해주어야 한다.
		 */	
		
		//int[] arr; //배열 사용을 위한 첫 번째 문법
	//	new int[4]; // 두번째 문법
		
		int[] arr = new int[] {10, 20, 30, 40};
		
		for(int i = 0; i<4; i++) {
			System.out.println(arr[i]);
		}
		/*
		 * arr[0] = 10; arr[1] = 20; arr[2] = 30;
		 */
	}
}

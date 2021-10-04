package exams;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {10, 20};
		
		
		System.out.println(arr[0] + " : " + arr[1]);
		
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		System.out.println(arr[0] + " : " + arr[1]);
	}

}

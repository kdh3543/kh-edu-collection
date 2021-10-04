package exams;

public class Exam_04 {

	public static void main(String[] args) {
		int[] arr = new int[] {38,22,19,5};
			
		System.out.print("정렬 전 : ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("정렬 후 : ");
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

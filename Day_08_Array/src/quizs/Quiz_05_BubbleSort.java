package quizs;

public class Quiz_05_BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {15,14,35,99,86,34,13,27,46,66,13,15,24,27,34,35,46,66,86,99};
		
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
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

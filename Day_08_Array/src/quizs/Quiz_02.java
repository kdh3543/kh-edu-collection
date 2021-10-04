package quizs;

public class Quiz_02 {

	public static void main(String[] args) {
		int[] arr1 = new int[100];
			
		for(int i = 0; i < arr1.length; i++) {
			
			arr1[i] = i+1;	
		}
		
		
		int[] arr2 = new int[100];
		
		for(int i = 100; i>0;i--) {
			arr2[arr2.length-i] = i;
		}
		System.out.println(arr2[99]);
		System.out.println(arr2[0]);
	
		char[] arr3 = new char[26];
		
		for(int i = 0; i<arr3.length; i++) {
			arr3[i] = (char)(90-i);		
		}
		System.out.println(arr3[0]);
		System.out.println(arr3[25]);
		
	}
}

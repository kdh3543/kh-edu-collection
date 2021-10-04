package quizs;
import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[3];
		
		for(int i = 0; i<x.length; i++) {
			x[i] = sc.nextInt();
			System.out.println(x[i]);
		}		
	}
}

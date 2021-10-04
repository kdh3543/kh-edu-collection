package exams;
import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.print("1번째 수 : "); 
		x = sc.nextInt();
		System.out.print("2번째 수 : "); 
		y = sc.nextInt();
		System.out.print("3번째 수 : "); 
		z = sc.nextInt();
		
		System.out.println("1번째 수 : " + x);
		System.out.println("2번째 수 : " + y);
		System.out.println("3번째 수 : " + z);
	}
}

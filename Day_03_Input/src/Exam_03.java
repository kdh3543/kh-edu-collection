import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		String num = sc.nextLine();		
		int result = Integer.parseInt(num);			
		System.out.println("더한 결과는 : " +(result + 10));
	}
}

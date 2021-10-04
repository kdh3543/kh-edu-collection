import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("여러자리 숫자 두 개를 입력받아 덧셈하는 프로그램");
		
		System.out.print("첫번째 숫자 : ");
		String input1 = sc.nextLine();
		System.out.print("두번째 숫자 : ");
		String input2 = sc.nextLine();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.println("덧셈의 결과 : " +
		(num1 + " + " + num2 + " = " +(num1 + num2)));
		
		// 여러자리 숫자 두 개를 입력받아
		// 덧셈한 결과를 출력하는 프로그램을 작성하세요.
	}
}
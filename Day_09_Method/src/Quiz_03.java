import java.util.Scanner;

public class Quiz_03 {
	public static int validInt(String str) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print(str);
				int num = Integer.parseInt(sc.nextLine());
				return num;
			}catch(Exception e) {
				System.out.println("숫자를 입력해야 합니다.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int num1 = validInt("첫 번째 수 입력 : ");
		
		System.out.println(num1);
		
	}

}

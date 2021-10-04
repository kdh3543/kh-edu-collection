import java.util.Scanner;

public class Quiz_10_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 구구단 출력 프로그램 ===");
		int gugud = 0;	
		while(true) {
			System.out.print("2~9단 중 선택 : ");
			while(true) {
				try {
					gugud = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 입력해주세요.");
				}
			}
			if(2<=gugud &&gugud<=9) {
				int i = 0;
				System.out.println("======================");
				System.out.println(gugud + "단");
				System.out.println("======================");
				while(i < 9) {
					i++;
					System.out.println(gugud + " * " + i + " = " + gugud*i);	
				}
			}else {
				System.out.println("구구단 범위를 다시 설정하세요.");
			}
		}
	}
}
import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		while(true) {
			while(true) {
				try {
					System.out.print("숫자 입력 : ");
					num = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 입력해주세요.");
				}
			}
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println("입력한 숫자의 총합은 " + sum);
		System.out.println("=======================");
		int sum2 =0;
		int num1 =0;
		for(;;) {
			
			while(true) {
				try {
					System.out.print("숫자 입력 : ");
					num1 = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 입력해주세요.");
				}
			}
			sum2 += num1;
			if(num1 == 0) {
				break;
			}
		}
		System.out.println("숫자의 총 합은" + sum2);
	}
}
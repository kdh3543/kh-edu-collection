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
				System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int num1 = validInt("ù ��° �� �Է� : ");
		
		System.out.println(num1);
		
	}

}

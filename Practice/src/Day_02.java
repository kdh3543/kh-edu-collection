import java.util.Scanner;

public class Day_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 1 ~ n ������ �� ���ϱ� ===");
		System.out.print("n �Է� : ");
		int enter = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int num = 0;
		while(num < enter) {
			sum += ++num;
		}
		System.out.println(sum);
	}
}

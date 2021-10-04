import java.util.Scanner;

public class Day_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 1 ~ n 까지의 합 구하기 ===");
		System.out.print("n 입력 : ");
		int enter = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int num = 0;
		while(num < enter) {
			sum += ++num;
		}
		System.out.println(sum);
	}
}

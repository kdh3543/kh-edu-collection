import java.util.Scanner;

public class Quiz_08_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 횟수를 정하고 그 횟수만큼 출력되는 프로그램");
		System.out.print("출력 반복 횟수 : ");
		int input = Integer.parseInt(sc.nextLine());
		int i = 0;
		
		while(i < input) {
			i++;
			System.out.println(i + " : Hello Java");
		}
	}
}

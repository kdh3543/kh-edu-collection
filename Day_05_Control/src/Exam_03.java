import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과일을 선택하세요.");
		System.out.println("1. 망고 2. 포도 3. 바나나");
		System.out.println(">> ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1. 망고");
			break;
		case 2:
			System.out.println("2. 포도");
			break;
		case 3:
			System.out.println("3. 바나나");
			break;
		default:
			System.out.println("메뉴를 다시 확인해주세요.");
		}
	}
}

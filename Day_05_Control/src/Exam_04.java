import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지를 입력해주세요.");
		String msg = sc.nextLine();
		
		
		if(msg == "Apple") {
			System.out.println("입력된 단어는 사과입니다.");	
		}
	}
}
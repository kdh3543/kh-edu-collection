import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		// System.in.read(); -> 한글자만 int형으로 입력받는다.
		// 아직 정해지지 않은 숫자 하나
		
		String str = sc.nextLine(); // 한 라인을 String형으로 입력받는다.
		// 아직 정해지지 않은 문자열
		
		System.out.println("입력한 메세지는 : " + str);
	}
}

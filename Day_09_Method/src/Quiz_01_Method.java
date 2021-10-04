import java.util.Scanner;

public class Quiz_01_Method {
	public static String translate(String str) {
		if(str.equals("사과")) {
			return "Apple";
		}else if(str.equals("포도")) {
			return "Grape";
		}else
			return "None";
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(translate(sc.nextLine()));
		
	}
}
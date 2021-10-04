
public class Exam_03 {

	public static void main(String[] args) {
		
		String str = "Hello";
	
		System.out.println(str.length());
		char a = str.charAt(4);
		System.out.println(a);
		char[]cArray = str.toCharArray();
		System.out.println(cArray);
		
		int[] array = new int[] {1,2,3,4,5};
		System.out.println(array);
		
		boolean result = str.startsWith("H");
		System.out.println(result);
		boolean res = str.endsWith("o");
		System.out.println(res);
		boolean y = str.contains("el");
		System.out.println(y);
		
		String str2 = "Apple:Orange:Mango";
		String[] fruits = str2.split("n"); //특정 문자열을 나눠주는 메소드
		System.out.println(fruits[2]); 
	}
}

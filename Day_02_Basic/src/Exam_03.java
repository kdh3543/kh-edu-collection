
public class Exam_03 {
	public static void main(String[] args) {
		// Data type Promotion
	/*byte a = 10;
	short b = 20;*/
	
	int a = 10;
	double b = 3.14;
	
	System.out.println(a+b);
	
	System.out.println("변수 a 안에 저장된 값은 " + a + " 입니다."); 
	//String은 연산 중에 기본자료형으로 가장 큰 자료형이 된다.
	// =>> 자동으로 a의 int는 String으로 변경됨
	
		// Data type Casting
	short c = 1000;
	byte d = (byte)c;
	System.out.println(d);
	
	int e = 5;
	int f = 2;
	System.out.println(e / (double)f);
	
	}
}

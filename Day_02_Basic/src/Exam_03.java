
public class Exam_03 {
	public static void main(String[] args) {
		// Data type Promotion
	/*byte a = 10;
	short b = 20;*/
	
	int a = 10;
	double b = 3.14;
	
	System.out.println(a+b);
	
	System.out.println("���� a �ȿ� ����� ���� " + a + " �Դϴ�."); 
	//String�� ���� �߿� �⺻�ڷ������� ���� ū �ڷ����� �ȴ�.
	// =>> �ڵ����� a�� int�� String���� �����
	
		// Data type Casting
	short c = 1000;
	byte d = (byte)c;
	System.out.println(d);
	
	int e = 5;
	int f = 2;
	System.out.println(e / (double)f);
	
	}
}

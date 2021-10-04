
public class Exam_04 {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40L;
		float f = 3.14f;
		double d = 5.11;
		char c = 'a';
		
		s = b;
		i = s;
		l = i;
		d = f;
		
		b = (byte)s;
		s = (short)i;
		i = (int)l;
		f = (float)d;
		b = (byte)c;
		b = (byte)d;
		s = (short)c;
		l = (long)f;
		
	}
}


public class Exam_02_While {
	public static void main(String[] args) {
		int i = 49; // �ʱⰪ ����(�ʱ�ȭ�Ѵ�.)
		while(i < 100) { // ���ǹ�
			i++;// ������ ==> ������ ���ѷ����� ����
			if(i%2 == 1) {
				System.out.println("i = " + i);
			}	
		}
	}
}

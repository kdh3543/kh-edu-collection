import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pick = 0;
		int ps = 0;
		int cs = 0;
		while(true) {
			int ran = (int)(Math.random()*2 + 1);
			System.out.println(ps + " : " + cs);
			System.out.println("===���� �� �� ���߱�===");
			

			while(true) {
				try {
					System.out.print("���ڸ� �Է����ּ���(1.�ո� / 2.�޸�) : ");
					pick = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �ٽ� �Է����ּ���.");
				}
			}
			
			if(pick == 0) {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}

			if(pick != 1 && pick != 2) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}else {
				if(pick == ran) {
					System.out.println("������ϴ�!!");
					ps++;
				}else
					System.out.println("Ʋ�Ƚ��ϴ�.");
					cs++;
			}
			
			System.out.println("----------------------------> restart");
		}
	}
}

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hm = 0;
		while(true) {
			System.out.println("=== ATM �ùķ����� ===");
			System.out.println("1. �ܾ���ȸ");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. �����ϱ�");
			System.out.print("�޴��� �����ϼ���: ");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {
				System.out.println("���� ���� �ܾ��� " + hm + "�� �Դϴ�.");
			}else if(menu == 2) {
				System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�: ");
				int pm = Integer.parseInt(sc.nextLine());
				hm += pm;
			}else if(menu == 3) {
				System.out.print("�󸶸� ����Ͻðڽ��ϱ�: ");
				int om = Integer.parseInt(sc.nextLine());
				if(om > hm) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else {
					System.out.println(om + "���� ��ݵǾ����ϴ�.");
					hm -= om;
				}
			}else if(menu == 4) {
				System.out.println("�ý����� �����մϴ�. �ȳ��� ������.");
				break;
			}else {
				System.out.println("�ٽ� �������ּ���.");
			}
		}
	}
}
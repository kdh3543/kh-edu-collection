import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int ps = 0;
		int cs = 0;
		int i = 0;
		while(true) {
			i++;
			System.out.println("===���� ���� �� ����===");
			System.out.println(i + "��° ����");
			System.out.print("���ڸ� �����ϼ���(1.����/2.����/3.��) : ");
			int com = (int)(Math.random()*3+1);
			while(true) {
				try {
					sel = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڷ� �Է����ּ���.");
				}
			}

			System.out.println("========= ��� =========");
			if(sel == 1) {
				System.out.println("����� ������ �½��ϴ�.");
			}else if(sel == 2) {
				System.out.println("����� ������ �½��ϴ�.");
			}else if(sel == 3){
				System.out.println("����� ���� �½��ϴ�.");
			}else if(sel == 0) {
				System.out.println("������ ����Ǿ����ϴ�.");	
				break;
			}else {
				System.out.println("�ٽ� �������ּ���.");
				continue;
			}
			
			if(com == 1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			}else if(com == 2) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			}else
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			
			System.out.println("=======================");
			if(sel == com) {
				System.out.println("��ǻ�Ϳ� �÷��̾ �����ϴ�.");
			}else if((sel == 1 && com == 2) || (sel==2 && com==3) || (sel==3&&com==1)) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				cs++;
			}else {
				System.out.println("�÷��̾ �̰���ϴ�.");
				ps++;
			}
			System.out.println(ps + " : " + cs);
		}
		System.out.println("���� ���ھ� : " + ps + " : " + cs);
		if(ps > cs) {
			System.out.println("�÷��̾� ��!!!");
		}else if(ps < cs) {
			System.out.println("��ǻ�� ��!!!");
		}else
			System.out.println("���º�~!!!");
	}

}

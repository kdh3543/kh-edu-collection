import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = 0;
		while(true) {	
			System.out.println("***ATM �ùķ�����***");
			System.out.println("1. �ܾ���ȸ");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. �����ϱ�");
			System.out.print(">> ");
			while(true) {
				try {
					input = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �Է����ּ���.");
				}
			}

			if(input == 1) {
			}else if(input == 2) {
				while(true) {
					try {
						System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�? ");
						System.out.print(">> ");
						int put = Integer.parseInt(sc.nextLine());
						sum += put; // ����ڰ� �Է��� ���� ���� ������ �ִ� ���� ���ؼ� ����
						System.out.println(put + "���� �Ա� �Ǿ����ϴ�.");
						break;
					}catch(Exception e) {
						System.out.println("���ڸ� �Է����ּ���.");
					}
				}
			}else if(input == 3) {
				while(true) {
					while(true) {
						try {
							System.out.println("�󸶸� ����Ͻðڽ��ϱ�? ");
							System.out.print(">> ");
							int out = Integer.parseInt(sc.nextLine());
							if(out <= sum) {
								sum -= out;
								System.out.println(out + "���� ��� �Ǿ����ϴ�.");
								break;
							}else if(out > sum) {
								System.out.println("�ٽ� ����Ͻ� �ݾ��� �Է����ּ���.");	
							}
						}catch(Exception e) {
							System.out.println("���ڸ� �Է����ּ���.");
						}
					}
					break;
				}
			}else if(input == 4) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			System.out.println("���� ���� �ܾ���" + sum + " �� �Դϴ�.");
			System.out.println();
		}
	}
}

import java.util.Scanner;

public class Day_04_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int menu = 0;
		while(true) {
			System.out.println("===Atm Simulator===");
			System.out.println("1. �ܾ���ȸ");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. �����ϱ�");
			System.out.print(">> ");
			while(true) {
				try {
					menu = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �ٽ� �Է����ּ���.");
				}
			}
			if(menu == 1) {				
			}else if(menu == 2) {
				while(true) {
					try {
						System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ� : ");
						int put = Integer.parseInt(sc.nextLine());
						System.out.println(put + " ���� �Ա� �Ǿ����ϴ�.");
						sum += put;
						break;
					}catch(Exception e) {
						System.out.println("���ڸ� �ٽ� �Է����ּ���.");
					}
				}
			}else if(menu == 3) {
				while(true) {
					while(true) {
						try {System.out.print("�󸶸� ����Ͻðڽ��ϱ� : ");
						int out = Integer.parseInt(sc.nextLine());
						if(sum < out) {
							System.out.println("�ܾ��� �����մϴ�.");
						}else {
							System.out.println(out + " ���� ��� �Ǿ����ϴ�.");
							sum -= out;
							break;
						}
						}catch(Exception e) {
							System.out.println("���ڸ� �ٽ� �Է����ּ���.");
						}
					}
					break;
				}
			}else if(menu == 4) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			System.out.println("���� ���� �ܾ��� "+ sum + " �Դϴ�.");
		}
	}

}

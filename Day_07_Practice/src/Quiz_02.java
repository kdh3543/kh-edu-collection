import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int input = 0;
		int bs = 100;
		int com = 0;
		int i = 0;
		int cs = 0;
		int ps = 0;
		while(true) {
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");

			while(true) {
				try {
					System.out.print("�޴� ���� : ");
					menu = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("��ȣ�� �Է��� �ּ���.");
				}
			}
			if(menu == 1) {

				i = 0;
				int answer = (int)(Math.random()*99 + 1);
				System.out.println("<< Game Start >>");
				System.out.println(answer);
				//�÷��̾� ����
				System.out.println("==== Player Turn ====");
				while(true) {
					i++;
					System.out.println(i + "��° �õ�");

					while(true) {
						try {
							System.out.print("Input Number : ");
							input = Integer.parseInt(sc.nextLine());
							break;
						}catch(Exception e) {
							System.out.println("��ȣ�� �Է��� �ּ���.");
						}
					}
					if(input==answer) {
						System.out.println("����");						
						// ������ ���ߴ� ����, �÷��̾��� ������ �ְ� ��ϰ� ���ؼ� �� ���� �������� Ȯ���ؾ���
						ps++;
						System.out.println("�÷��̾� ��");
						break;
					}else if(input < answer) {
						System.out.println("<< UP >>");

					}else if(input > answer) {
						System.out.println("<< DOWN >>");
					}

					// ��ǻ�� ����
					System.out.println("==== Computer Turn ====");

					System.out.println(i + "��° �õ�");
					System.out.print("Input Number : ");
					com = (int)(Math.random()*99+1);
					System.out.println(com);
					if(com==answer) {
						System.out.println("����");
						cs++;
						System.out.println("��ǻ�� ��");
						break;
					}else if(com < answer) {
						System.out.println("<< UP >>");

					}else if(com > answer) {
						System.out.println("<< DOWN >>");
					}
				}
			}else if(menu == 2) { 	
				System.out.println("���ھ� == " + "�÷��̾� = " + ps + " : " + " ��ǻ�� = " + cs);
			}else if(menu == 3) {
				System.out.println("������ �����ϰڽ��ϴ�.");
				break;
			}else
				System.out.println("�ٽ� �Է����ּ���.");
		}
	}	
}

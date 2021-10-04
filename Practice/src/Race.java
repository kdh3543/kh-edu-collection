import java.util.Scanner;

public class Race {
	public static void main(String[] ar) {

	    Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*99+1);


        System.out.println("== Up & Down Game == ");
        System.out.println("1. Game Start");
        System.out.println("2. Game Score");
        System.out.println("3. End Game ");
        System.out.print(">>");

        int menu = Integer.parseInt(sc.nextLine());
        int i = 0;

        while(true) {
            switch (menu){
            case 1:
                System.out.println(" << Game Start >> ");
                System.out.print("Input Number :");
                i = Integer.parseInt(sc.nextLine());
                if(i>num) {
                    System.out.println("down");
                    continue;
                }
                else if(i==num) {
                    System.out.println("정답 입니다");
                    break;
                }else {
                    System.out.println("up");
                    continue;
                }


            case 3:
                System.exit(0);
            }
        }
    }
}
		
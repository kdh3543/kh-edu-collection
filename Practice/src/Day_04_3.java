

public class Day_04_3 {
	public static void main(String[] args) {
		
		// 3~6 사이 10번 반복
		System.out.println("3 ~ 6 사이 숫자");
		for(int i = 0; i < 10; i++) {
			double ran1 = Math.random();
			System.out.println((int)(ran1*4) + 3);
		}
		
		// 5 ~ 15 사이 3번 반복
		System.out.println("5 ~ 15 사이 숫자");
		for(int i = 0; i < 3; i++) {
			double ran1 = Math.random();
			System.out.println((int)(ran1*11) + 5);
		}
		// 45 ~ 100 사이 3번 반복
		System.out.println("45 ~ 100 사이 숫자");
		for(int i = 0; i < 3; i++) {
			double ran1 = Math.random();
			System.out.println((int)(ran1*56) + 45);
		}
		// 14 ~ 37 사이 4번 반복
		System.out.println("14 ~ 37 사이 숫자");
		for(int i = 0; i < 4; i++) {
			double ran1 = Math.random();
			System.out.println((int)(ran1*24) + 14);
		}
	}

}

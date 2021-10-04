
public class Exam_02_While {
	public static void main(String[] args) {
		int i = 49; // 초기값 지정(초기화한다.)
		while(i < 100) { // 조건문
			i++;// 증감문 ==> 없을때 무한루프에 빠짐
			if(i%2 == 1) {
				System.out.println("i = " + i);
			}	
		}
	}
}

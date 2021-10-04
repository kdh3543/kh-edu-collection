
public class Quiz_02 {

	public static int myRand(int num1, int num2) {
		return (int)(Math.random()*(num2-num1+1)+num1);
	}
	public static void main(String[] args) {
		System.out.println(myRand(10,20));
	}
}

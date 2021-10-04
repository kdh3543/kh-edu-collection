
public class Quiz_04 {
	public static int countA(String word) {
		String[] A = word.split("");
		int count = 0;
		for(int i = 0; i<word.length();i++) {
			if("A".equals(A[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static int countB(String word) {
		char fac = word.charAt(0);
		int count = 0;
		for(int i = 0;i<word.length();i++) {
			if('A' == word.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	public static int countC(String word) {
		char[] fac = word.toCharArray();
		int count = 0;
		for(int i = 0;i<word.length();i++) {
			if('A' == fac[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "FSGDFGSDGSGREAGFADGADAFAAFGADAASVAXCVXVDBDGDAAAAASGFDSGFCVBXSFASEFHKSLHFLJHFILHESLIGHJFJKDSGHJKLSDHGKJHDFSKJGHDFKGHKDFSL";

		int count = countA(str);
		int count1 = countB(str);
		int count2 = countC(str);
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);
	}
}

package exams;

public class Exam_05 {
	public static void main(String[] args) {
		// �ߺ����� �ʴ� ���� ����� ���.
		int num = (int)(Math.random()*5+1);

		//1 ~ 5 ������ �ߺ����� �ʴ� ���� 3�� �����
		//ī�弯�� �˰���

		int[] arr = new int[] {1,2,3,4,5};

		for(int i = 0; i<arr.length*100;i++) {
			int x = (int)(Math.random()*5); // 0~4
			int y = (int)(Math.random()*5);

			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
		}

	}
}

package classes;
abstract public class Grade {
	private int id; // ȸ�� ���� ID
	private String name; // ȸ�� �̸�
	private int point; // ȸ�� ����Ʈ
	
	public Grade() {}
	public Grade(int id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	public void Silver() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	abstract public double getBonus();
}

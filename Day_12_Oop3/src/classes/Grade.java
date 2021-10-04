package classes;
abstract public class Grade {
	private int id; // 회원 고유 ID
	private String name; // 회원 이름
	private int point; // 회원 포인트
	
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

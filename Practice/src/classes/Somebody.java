package classes;

public class Somebody {
	private int id;
	private String name;
	private int point;
	
	public Somebody() {
		super();
	}
	
	public Somebody(int id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return this.point;
	}
	
	public static void c() {}
	
}

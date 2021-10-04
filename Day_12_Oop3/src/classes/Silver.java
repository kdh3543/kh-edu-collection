package classes;

public class Silver extends Grade{
	public Silver(int id, String name, int point) {
		super(id, name, point);
	}
	
	public Silver() {}
	
	public double getBonus() {
		return this.getPoint() * 0.02;
	}
}

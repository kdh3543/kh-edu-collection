package classes;

public class Gold extends Grade{
	public Gold(int id, String name, int point) {
		super(id, name, point);
	}
	public Gold() {}
	
	public double getBonus() {
		return this.getPoint() * 0.03;
	}
}
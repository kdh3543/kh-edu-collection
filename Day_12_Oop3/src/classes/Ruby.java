package classes;

public class Ruby extends Grade{
	public Ruby(int id, String name, int point) {
		super(id, name, point);
	}
	
	public double getBonus() {
		return getPoint() * 0.05;
	}
}

package classes;

public class Diamond extends Grade {
	public Diamond(int id,String name,int point) {
		super(id, name, point);
	}
	
	public double getBonus() {
		return getPoint() * 0.07;
	}
}

package classes;

public class Book {
	private int id = 1000;
	private String title = "로미오 줄리엣";
	private int price = 10000;
	
	public Book() {		
	}
	public Book(int id, String title, int price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
}

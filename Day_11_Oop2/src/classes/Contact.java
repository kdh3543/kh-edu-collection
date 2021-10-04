package classes;

public class Contact {
	private int id = 1001;
	private String name = "Susan";
	private String contact = "01012341234";
	
	public Contact() {}
	public Contact(int id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getContact() {
		return contact;
	}
	
}

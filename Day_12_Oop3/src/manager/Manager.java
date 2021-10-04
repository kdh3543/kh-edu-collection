package manager;

import java.util.ArrayList;

import classes.Grade;

public class Manager {
	private ArrayList members = new ArrayList();
	private int index = 0;
	
	public void addMember(Grade g) {
		this.members.add(g);
	}
	
	public ArrayList getMembers() {
		return members;
	}
}
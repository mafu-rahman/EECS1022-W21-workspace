package model;

public class Instructor {
	String name;
	int campusPhExt;
	String email;
	
	public Instructor(String name, int campusPhExt, String email) {
		this.name = name;
		this.campusPhExt = campusPhExt;
		this.email = email;
	}
	
	
	/* Accessors */
	public String getName() {
		return this.name;
	}
	
	public int getPhoneExtension() {
		return this.campusPhExt;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getInformation() {
		String info = "Instructor " + this.name + " has campus phone extension " + this.campusPhExt + " and contact email " + this.email;
		return info;
	}
	
	
	
	/* Mutators */
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneExtension(int phExt) {
		this.campusPhExt = phExt;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}

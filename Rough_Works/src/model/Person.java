package model;

public class Person {
	
	public String name;
	static String id = "yu";
	static int gc = 1;
	private static int nos;
	
	public Person(String name) {
		this.id = this.id + gc;
		gc++;
		this.name = name;
	}
	
	public int nos() {
		return this.nos;
	}
	
	public String toString() {
		return name+" has id " +id + nos;
	}
	

}

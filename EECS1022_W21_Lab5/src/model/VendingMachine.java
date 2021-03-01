package model;

public class VendingMachine {
	String status;
	int coke;
	int oj;
	int kitkat;
	int lays;
	
	
	//Constructor
	public VendingMachine() {
		this.status = "Empty VM Started";
		this.coke = 0;
		this.oj = 0;
		this.kitkat = 0;
		this.lays = 0;
	}

	
	// Check Status of Vending Machine
	public String checkStatus() {
		return status;
	}
	
	
	// Check Entire Stock
	public String checkStock() {
		String result="";
		result = "Stock: "+checkStock("Coke")+", "+checkStock("Orange Juice")+", "+checkStock("Kitkat Chunky Bar")+", "+checkStock("Lay's Classic Chips");
		return result;
	}
	
	
	// Check Stock of particular product
	public String checkStock(String s) {
		String result = "";
		
		if(s.equals("Coke")) {
			result = "Coke ("+coke+")";
		}
		else if(s.equals("Orange Juice")) {
			result = "Orange Juice ("+oj+")";
		}
		else if(s.equals("Kitkat Chunky Bar")) {
			result = "Kitkat Chunky Bar ("+kitkat+")";
		}
		else if(s.equals("Lay's Classic Chips")) {
			result = "Lay's Classic Chips ("+lays+")";
		}
		else {
			result = "Invalid product: " + s;
		}
		return result;
	}
	
	
	// Add product
	public void add(String s, int i) {
		String result = "Product added: ";
		
		if(s.equals("Coke")) {
			coke += i;
			result += s+" ("+i+")";
		}
		else if(s.equals("Orange Juice")) {
			oj += i;
			result += s+" ("+i+")";
		}
		else if(s.equals("Kitkat Chunky Bar")) {
			kitkat += i;
			result += s+" ("+i+")";
		}
		else if(s.equals("Lay's Classic Chips")) {
			lays += i;
			result += s+" ("+i+")";
		}
		else {
			result = "Invalid product: " + s;
		}
		
		status = result;
	}
	

	// Remove product
	public void dispense(String s, int i) {
		String result = "Product removed: ";
		
		if(s.equals("Coke")) {
			coke -= i;
			result += s+" ("+i+")";
		}
		else if(s.equals("Orange Juice")) {
			oj -= i;
			result += s+" ("+i+")";
		}
		else if(s.equals("Kitkat Chunky Bar")) {
			kitkat -= i;
			result += s+" ("+i+")";
		}
		else if(s.equals("Lay's Classic Chips")) {
			lays -= i;
			result += s+" ("+i+")";
		}
		else {
			result = "Invalid product: " + s;
		}
		
		status = result;
	}
}

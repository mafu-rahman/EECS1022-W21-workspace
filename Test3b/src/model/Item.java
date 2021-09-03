package model;

public class Item {
	String title;
	int amount;
	String info;
	
	
	/*
	 * Constructors
	 */
	public Item(String title) {
		this.title = title;
		this.amount = 0;
		this.info = "Item: " + this.title + " (" + this.amount + ")";
	}
	
	
	
	/*
	 * Accessors
	 */
	
	public String getTitle() {
		return this.title;
	}
	
	
	public int getAmount() {
		return this.amount;
	}
	
	public String getInfo() {
		return this.info;
	}
	
	
	/*
	 * Mutators
	 */
	
	public void increaseAmount(int amount) {
		if(amount>0) {
			this.amount += amount;
			this.info = "Item: " + this.title + " (" + this.amount + ")";
		}
		
		else {
			this.info = "Error: non-positive amount " + amount ;
		}
	}
	
	public void decreaseAmount(int amount) {
		if(amount <= 0) {
			this.info = "Error: non-positive amount " + amount ;
		}
		
		else if(this.amount < amount && amount>0) {
			this.info = "Error: amount is short of " + (amount-this.amount) ;
		}
		
		else {
			this.amount -= amount;
			this.info = "Item: " + this.title + " (" + this.amount + ")";
		}
	}
	
}

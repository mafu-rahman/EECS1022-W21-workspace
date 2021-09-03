package model;

public class Repository {
	
	Item[] itemList;
	int noc;
	int capacity;
	
	
	/*
	 * Constructors
	 */
	public Repository(int capacity) {
		this.capacity = capacity;
		itemList = new Item[capacity];
		noc = 0;
	}
	
	
	
	/*
	 * Accessors
	 */
	
	public Item[] getItems() {
		Item[] itemListCopy = new Item[noc];
		
		for(int i=0; i<noc; i++) {
			itemListCopy[i] = itemList[i];
		}
		
		return itemListCopy;
	}
	
	public Item[] getItems(String[] s) {
		int c=0;
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<noc; j++) {
				if(itemList[j].getTitle().equals(s[i])) {
					c++;
				}
			}
		}
		
		Item[] itemListCopy = new Item[c];
		c=0;
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<noc; j++) {
				if(itemList[j].getTitle().equals(s[i])) {
					itemListCopy[c] = itemList[j];
					c++;
				}
			}
		}
		
		return itemListCopy;
	}
	
	public Item[] getItemsOutsideRange(int a, int b) {
		int c=0;
		
		for(int i=0; i<noc; i++) {
			if(itemList[i].getAmount() > a || itemList[i].getAmount() < b) {
				c++;
			}
		}
		
		Item[] itemListCopy = new Item[c];
		c=0;
		
		for(int i=0; i<noc; i++) {
			if(itemList[i].getAmount() > a || itemList[i].getAmount() < b) {
				itemListCopy[c] = itemList[i];
				c++;
			}
		}
		
		return itemListCopy;	
	}
	
	public int getAmount(String title) {
		int result = -1;
		for(int i=0; i<this.noc; i++) {
			if(itemList[i].getTitle().equals(title)) {
				result = itemList[i].getAmount();
			}
		}
		return result;
	}
	
	
	
	/*
	 * Mutators
	 */
	
	public void addItem(Item a) {
		boolean itemExist = false;
		
		for(int i=0; i<noc; i++) {
			if(itemList[i].getTitle().equals(a.getTitle())) {
				itemList[i].increaseAmount(a.getAmount());
				itemExist = true;
			}
		}
		
		if(noc<this.capacity && itemExist != true) {
			itemList[noc] = a;
			noc++;
			}	
		}
	
	public void decreaseAmount(String s, int a) {
		for(int i=0; i<noc; i++) {
			if(itemList[i].getTitle().equals(s)) {
				itemList[i].decreaseAmount(a);
			}
		}
	}
	
}

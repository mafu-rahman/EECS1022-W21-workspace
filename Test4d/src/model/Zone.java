package model;

public class Zone {
	
	int capacity;
	MovieRecord[] movieRecord;
	public static int idNum = 23;
	String id;
	String status;
	boolean error;
	
	int nod;
	int nor;
	
	
	public Zone(int capacity) {
		this.capacity = capacity;
		this.movieRecord = new MovieRecord[100];
		this.nor = 0;
		this.nod = 0;
		this.id = "Zone-" + Zone.idNum;
		Zone.idNum += 11;
		this.status = "";
		this.error = false;
	}

	
	
	
	private boolean movieExists(MovieRecord mr) {
		boolean status = false;
		for(int i=0; i<nor; i++) {
			if(movieRecord[i].getName().equals(mr.getName())){
				status = true;
			}
		}
		return status;
	}
	
	private int getIndex(MovieRecord mr) {
		int index = 0;
		for(int i=0; i<nor; i++) {
			if(movieRecord[i].getName().equals(mr.getName())){
				index = i;
			}
		}
		return index;
	}
	/*
	 * Accessors
	 */
	
	public String getID() {
		return this.id;
	}
	
	public int getNumberOfMovieRecords() {
		return this.nor;
	}
	
	public int getNumberOfMovieDVDs() {
		return this.nod;
	}
	
	public String getStatus() {
		if(!this.error) {
		this.status = this.nor + " records and " + this.nod + " DVDs: {";
		String s="";
		for(int i=0; i<nor; i++) {
			if(i == nor-1) {
				s += movieRecord[i].getNameandDVD();
			}
			else {
				s += movieRecord[i].getNameandDVD() + ", ";
			}
		}
		this.status += s + "}";
		}
		
		
		return this.status;
	}
	
	
	
	/*
	 * Mutators
	 */
	
	public void addMovieRecord(MovieRecord mr) {
		int space = this.capacity - this.nod;
		
		if(mr.numOfDVD > space) {
			this.error = true;
			this.status = "Error: insufficient space left in the zone ("+ (mr.numOfDVD-space) + " DVDs short)";
		}
		
		else if(this.capacity > this.nod) {
			if(movieExists(mr)) {
				int index = getIndex(mr);
				this.movieRecord[index].setDVD(mr.numOfDVD);
				this.nod += mr.getNumberOfDVDs();
			}
			
			else {
				this.movieRecord[nor] = mr;
				nor++;
			
				this.nod += mr.getNumberOfDVDs();
			}
		}
		else {
			this.error = true;
			this.status = "Error: maximum number of movie DVDs (" + this.capacity + ") reached";
		} 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

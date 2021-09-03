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
	
	public void addMovieRecord(MovieRecord mr) {
		
		if(this.capacity > this.nod) {
			this.movieRecord[nor] = mr;
			nor++;
			
			this.nod += mr.getNumberOfDVDs();
			}
		
		else {
			this.error = true;
			this.status = "Error: maximum number of movie DVDs (" + this.capacity + ") reached";
		} 
	}
	
}

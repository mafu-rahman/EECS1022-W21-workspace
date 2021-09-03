package model;

public class MovieRecord {
	
	String movieName;
	int numOfDVD;
	Zone zone;
	public int serialNum;
	String movieSerial;
	
	/*
	 * Constructors
	 */
	
	public MovieRecord(String name, int num, Zone zone) {
		this.movieName = name;
		this.numOfDVD = num;
		this.zone = zone;
		this.movieSerial = this.movieName + "-" + this.serialNum;
		this.serialNum += 1;
	}
	
	public String getNameandDVD() {
		String s = this.movieName + " ("+this.numOfDVD+")";
		return s;
	}
	public String getName() {
		return this.movieName;
	}
	public int getNumberOfDVDs() {
		return this.numOfDVD;
	}
	public Zone getZone() {
		return this.zone;
	}
	
	public String getID() {
		String id = this.zone.getID() + "-" + this.movieSerial;
		return id;
	}
	
	
	public void setDVD(int d) {
		this.numOfDVD += d;
	}
}

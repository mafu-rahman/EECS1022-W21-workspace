package model;

public class OnlineSchool {
	Participant[] participant;
	private final int MAX_STUDENT = 100;
	private int nos; // Number of Students
	
	
	public OnlineSchool() {
		this.participant = new Participant[this.MAX_STUDENT];
		this.nos = 0;
	}
	
	
	// Accessors
	public Participant[] getParticipants(String s) {
		boolean hasCourse = false;
		int c=0;
		
		for(int i=0; i<this.nos; i++) {
			Registration[] course = this.participant[i].getRegistrations();
			
			for(int j=0; (!hasCourse && j <course.length) ; j++) {
				if(course[j].getTitle().equals(s)) {
					hasCourse=true;
					c++;
				}
			}
			hasCourse=false;
		}
		
		Participant[] participantList = new Participant[c];
		c=0;
		
		for(int i=0; i<this.nos; i++) {
			Registration[] course = this.participant[i].getRegistrations();
			
			for(int j=0; (!hasCourse && j <course.length) ; j++) {
				if(course[j].getTitle().equals(s)) {
					hasCourse=true;
					participantList[c] = participant[i];
					c++;
				}
			}
			hasCourse=false;
		}
		
		return participantList;
	}
	
	
	// Mutators
	public void addParticipant(Participant p) {
		if(this.nos < this.MAX_STUDENT) {
			this.participant[this.nos] = p;
			this.nos++;
		}
	}	
	
}

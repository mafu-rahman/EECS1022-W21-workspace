package model;

public class Participant {
	String name;
	private int nor; // number of registrations
	private final int MAX_REG = 5;
	private Registration[] registration;
	
	
	public Participant() {
		this.registration = new Registration[this.MAX_REG];
		this.nor = 0;
	}
	
	public Participant(String name){
		this();
		this.name = name;
	}
	
	
	
	//Helper Methods
	private Registration findCourse(String course) {
		Registration r = null;
		for(int i=0; i<this.nor; i++) {
			if(registration[i].title == course) {
				r = registration[i];
			}
		}
		return r;
	}
	
	private int getGP(String s) {
		int gp=0;
		if(s.equals("A+")) {
			gp = 9;
		}
		else if(s.equals("A")) {
			gp = 8;
		}
		else if(s.equals("B")) {
			gp = 7;
		}
		else if(s.equals("C")) {
			gp = 6;
		}
		else if(s.equals("D")) {
			gp = 5;
		}
		else if(s.equals("F")) {
			gp = 0;
		}
		
		return gp;
	}
	
	
	/* Accessor */
	public Registration[] getRegistrations() {
		Registration[] temp_reg = new Registration[this.nor];
		for(int i=0; i<this.nor; i++) {
			temp_reg[i]=this.registration[i];
		}
		return temp_reg;
	}
	
	public String getGPAReport() {
		String gpa = "";
		double sum = 0.0;
		
		if(this.nor>0) {
			gpa = this.name + "'s GPA of {";
			for(int i=0; i<this.nor; i++) {
				String l = registration[i].getGradeReport()[0];
				if(i==this.nor-1) {
					int gp = getGP(l);
					sum += gp;
					gpa += gp + " (" + l + ")}: ";
				}
				else {
					int gp = getGP(l);
					sum += gp;
					gpa += gp + " (" + l + "), ";
				}
			}
		gpa += (String.format("%.1f", (sum/this.nor)));
		}
		else {
			gpa = "No GPA available yet for " + this.name;
		}
		
		return gpa;
	}
	
	public int marksOf(String course) {
		int marks = -1;
		if(findCourse(course) != null) {
			marks = findCourse(course).getMarks();
		}
		return marks;
	}
	
	
	/* Mutators */
	
	public void addRegistration(Registration r) {
		if(this.nor < this.MAX_REG) {
			this.registration[this.nor] = r;
			this.nor++;
		}
	}
	public void addRegistration(String title) {
		this.registration[this.nor] = new Registration(title);
		this.nor++;
	}
	
	public void updateMarks(String course, int m) {
		if(findCourse(course) != null) {
			findCourse(course).setMarks(m);
		}
	}
	
	public void clearRegistrations() {
		for(int i=0; i<nor; i++) {
			this.registration[i] = null;
		}
		this.nor = 0;
	}	
}

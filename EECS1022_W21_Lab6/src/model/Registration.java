package model;

public class Registration {
	String title;
	int marks;
	
	private Instructor instructor;
	
	public Registration(String title) {
		this.title = title;
	}
	
	public Registration(String title, Instructor i) {
		this.title = title;
		this.instructor = i;
	}
	
	/* Accessors */
	public String getTitle() {
		return this.title;
	}
	
	public int getMarks() {
		return this.marks;
	}
	
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	public String[] getGradeReport() {
		int m = this.marks;
		String grade = "";
		String d = "";
		String[] report = new String[2];
		
		if(m >= 90 && m <=100) {
			grade = "A+";
			d = "Exceptional";
		}
		else if(m>=80 && m<=89) {
			grade = "A";
			d = "Excellent";
		}
		else if(m>=70 && m<=79) {
			grade = "B";
			d = "Good";
		}
		else if(m>=60 && m<=69) {
			grade = "C";
			d = "Competent";
		}
		else if(m>=50 && m<=59) {
			grade = "D";
			d = "Excellent";
		}
		else if(m>=0 && m<=49) {
			grade = "F";
			d = "Failing";
		}
		else {
			grade = "-1";
			d = "Wrong Entry";
		}
		
		report[0]=grade;
		report[1]=d;
		
		return report;
	}
	
	public String getInformation() {
		String info = "";
		if(instructor != null) {
			info = this.title + ", taught by " + instructor.getName() + ", is completed with raw marks " + this.marks + " (" + getGradeReport()[0] + " ; " + getGradeReport()[1] + ")";
		}
		else {
			info = this.title + " has not yet been assigned an instructor";
		}
		
		return info;
	}
	
	
	/* Mutators */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void setInstructor(Instructor i) {
		this.instructor = i;
	}
	
}

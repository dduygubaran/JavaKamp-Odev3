package ödevÜç;

public class Student extends User{
	
	private String takenCourse;
	private int vize;
	private int finalNot;
	private int ortNot;

	public Student(String takenCourse, int vize, int finalNot, int ortNot) {
		this.takenCourse = takenCourse;
		this.vize = vize;
		this.finalNot = finalNot;
		this.ortNot = ortNot;
	}
	
	public Student() {
		
	}

	public String getTakenCourse() {
		return takenCourse + " adlı dersi almaktadır. ";
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}

	public int getVize() {
		return vize;
	}

	public void setVize(int vize) {
		this.vize = vize;
	}

	public int getFinalNot() {
		return finalNot;
	}

	public void setFinalNot(int finalNot) {
		this.finalNot = finalNot;
	}

	public int getOrtNot() {
		return ((vize%40 )+ (finalNot%60));
	}	
}

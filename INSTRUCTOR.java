package ödevÜç;

public class Instructor extends User{
	
	private String givenCourse;

	public Instructor(int id, int password, String givenCourse) {
		this.givenCourse = givenCourse;
	}
	public Instructor() {
		
	}
	public String getGivenCourse() {
		return givenCourse + " adlı dersi vermektedir.";
	}

	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
}

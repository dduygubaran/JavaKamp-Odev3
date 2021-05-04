package ödevÜç;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instructor instructor = new Instructor();
		instructor.setId("06");
		instructor.setPassword("1b23*A-");
		instructor.setGivenCourse("Signal and Systems");
		
		System.out.print(instructor.getKullanıcıNu());
		System.out.println(instructor.getId());
		System.out.print(instructor.getŞifre());
		System.out.println(instructor.getPassword());
		System.out.println(instructor.getGivenCourse());
		
		UserManager userManager = new UserManager();
		userManager.login(instructor);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.update(instructor);
		
		System.out.println("");
		
		Student student = new Student();
		student.setId("1111");
		student.setPassword("01aKjL");
		student.setTakenCourse("Introduction to Programming with Java");
		student.setVize(70);
		student.setFinalNot(53);
		
		System.out.print(student.getKullanıcıNu());
		System.out.println(student.getId());
		System.out.print(student.getŞifre());
		System.out.println(student.getPassword());
		System.out.println(student.getTakenCourse());
		System.out.println("Ortalama notunuz: "+student.getOrtNot());
		
		StudentManager studentManager = new StudentManager();
		userManager.login(student);
		studentManager.complaint(student);
	}

}

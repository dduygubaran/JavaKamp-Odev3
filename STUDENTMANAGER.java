package ödevÜç;

public class StudentManager extends UserManager {
	
	public void complaint(Student student) {
		System.out.println(student.getId() + " numaralı " + student.getTakenCourse() +
				"Vize sonucu olan "+ student.getVize() + " notuna itiraz etmiştir." );
	}

}

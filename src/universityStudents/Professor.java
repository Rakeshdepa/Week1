package universityStudents;

import java.util.ArrayList;
import java.util.List;

public class Professor implements StudentGrades {

	private String professorName;
	private Integer marks;
	List<StudentDetails> students = new ArrayList<>();
	
	
	public Professor(String professorName, Integer marks) {
		super();
		this.professorName = professorName;
		this.marks = marks;
	}
	
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	public synchronized void passedStudent(StudentDetails studentDetails) {
		students.add(studentDetails);
	}
	
	public synchronized void failedStudent(StudentDetails studentDetails) {
		students.add(studentDetails);
	}
	
	
	public void messageStudent(String message) {
		System.out.println("Professor Posted Message:: "+message+"\n");
		students.forEach(student->student.message(student.getStudentName(), this.professorName, this.marks, message));
	}
	

}

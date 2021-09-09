package universityStudents;

public class StudentDetails implements Promoted {
	
	
	private String studentName;
	
	public StudentDetails(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public void message(String studentName, String subject, Integer marks, String message) {
		System.out.println("Student " + studentName + " Scored " + marks + "% in Subject " + subject);
		
	}

}

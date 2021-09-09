package universityStudents;

public class FinalExams {
	
	public static void main(String args[]) {
		
		Professor professor = new Professor("Java",95);
		
		StudentDetails details1 = new StudentDetails("Rakesh");
		StudentDetails details2 = new StudentDetails("Lauri");
		StudentDetails details3 = new StudentDetails("Antonio");
		StudentDetails details4 = new StudentDetails("Brian");	
		StudentDetails details5 = new StudentDetails("Jeffrey");
		
		professor.passedStudent(details1);
		professor.passedStudent(details2);
		professor.passedStudent(details3);
		
		
		professor.messageStudent("Congratuations below students passed this subject with distinction and are promoted to next semester");
		
		
		Professor professor1 = new Professor("Java",35);
		
		professor1.failedStudent(details4);
		professor1.failedStudent(details5);
		
		System.out.println();
		professor1.messageStudent("Unfortunately below students failed in one or more in the final exams and cannot be promoted to further semester");
				
	}

}

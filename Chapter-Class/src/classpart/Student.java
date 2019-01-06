package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}	
	
	public void setStudentName(String name){
		studentName = name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentAhn = new Student();
		studentAhn.studentName = "서윤석"; 
		
		System.out.println(studentAhn.studentName);
		// use function 
		System.out.println(studentAhn.getStudentName());
		
	}

}

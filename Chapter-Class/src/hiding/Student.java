package hiding;

public class Student {
	
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	// private 변수인 studentName 에 접근해서 값을 가져오는 public get() 메소드
	public String getStudentName() {
		return studentName;
	}

	// studentName에 접근해 값을 지정하는 public set() 메서드 아직 this 대해서는 뒷 내용 
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
package staticex;

public class Student {

	//초기 설정값이 바뀔 수가 있습니다.
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	

	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
	//	studentName = "Seo";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
package classpart;

public class StudentTest1 {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentName = "학생 1"; 
		
		System.out.println(student1.getStudentName());
		// 생성자를 두번 사용해서 서로 다른 변수 클래스를 생성
		Student student2 = new Student();
		student2.studentName = "학생 2"; 
		
		System.out.println(student2.getStudentName());
	}
}

// * DB 연결을 안한 상태에서는 힙 메모리 라는 것이 사용되는 메모리
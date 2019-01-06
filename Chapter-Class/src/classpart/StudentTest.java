package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// 클래스형 변수 이름 = new 생성자;
			// 
			Student studentAhn = new Student();
			studentAhn.studentName = "서윤석"; 
			
			System.out.println(studentAhn.studentName);
			// 패키지내의 동일한 이름의 클래스
			System.out.println(studentAhn.getStudentName());
		}
	}


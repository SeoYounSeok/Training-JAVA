package hiding;


// private 로 선언한 예시를 들었을 때, 접근할 수 있는 것이 GET , SET 흔히 말하는 getter,setter 메소드

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// getter setter 쓰기 전에 에러난 곳.
		//studentLee.studentName = "서윤석";
		
		studentLee.setStudentName("서윤석");
		
		// 서윤석을 지정하고 서윤석을 출력해준다.
		
		System.out.println(studentLee.getStudentName());
	}
}

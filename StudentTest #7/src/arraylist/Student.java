package arraylist;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //Arraylist 선언하기
	
	// ArrayList<E> 변수명 = new ArrayList<E> ();
	
	int index;
	
	public Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // Arraylist 생성하기
	}
	
	public void addSubject(String name, int score){ // Add 
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo()
	{
		int total = 0;
		
		
		//자바 for (변수 : 배열) 이런 식으로 되어있습니다 .예시를 하나 들어보죠.
		// int arr[] = {1,2,3,4,5};
		// for(int num: arr)
		// {
		//		System.out.println(num);
		// }
		
		
		for(Subject s : subjectList){
			
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + 
			        s.getScorePoint() + "입니다.");
		}
			
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
}
package constructor;

public class PersonTest {
	
	 public static void main(String[] args) {
		  // 생성자 사용  Person
		  Person personKim = new Person();
		  
		  personKim.name = "김성태";
		  personKim.weight = 85.5F;
		  personKim.height = 180.0F;
		
		  Person personLee = new Person("이순신", 175, 75);
	 }
}

//*Tip : 객체 지향 프로그램에서 메서드 이름이 같고 매개변수만 다른 경우를 '오버로드' 라고 합니다.
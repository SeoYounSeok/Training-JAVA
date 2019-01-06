package constructor;

public class Person {
	  String name;
	  float height;
	  float weight;
	
	  // Java 에서 자동으로 제공하는 디폴트 생성자 
	  
	  public Person() {}
	
	  // 만약 위에 것을 주석 처리하면 에러가 납니다 왜?
	  
	  // 생성자를 직접추가하면, 디폴트 생성자는 만들어지지 않기 때문에, 오류가 남.
	  public Person(String pname) {
		   name = pname;
	  }
	  public Person(String pname, float pheight, float pweight){
		   name = pname;
		   height = pheight;
		   weight = pweight;
	  }
}   
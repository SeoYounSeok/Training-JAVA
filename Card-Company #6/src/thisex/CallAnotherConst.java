package thisex;

class Person {
	String name;
	int age;
	// 생성자에서 다른 생성자를 호출하는 this >> 많이 사용되지는 않는다 나와있슴..
	Person() {
		this("이름 없음", 1);
		// this를 사용해 Person(String, int) 생성자를 호출
	}
	//디폴트 생성자가 호출되는 경우 초깃값으로 "이름 없음" 과 1 값을 대입한다. 
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}

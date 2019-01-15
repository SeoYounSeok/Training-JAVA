package integerex;

public class IntegerDemo {

	
// 생성자
// Integer(int value) 기본형 int의 인수를 표현하는 Integer 객체를 제공한다. 
// Integer(String s) 스트링으로 표현되는 수치를 표현하는 Integer 객체를 생성한다

	public static void main(String[] args)
	{
		Integer num1 = new Integer(200);
		Integer num2 = new Integer("300");
		
		System.out.println("두수의 합은? " + (num1+num2) );
		
		int x = Integer.parseInt("1000");
		int y = Integer.parseInt("500");
		
		System.out.println("x와 y의 차는?" + (x-y));
		
	}
}

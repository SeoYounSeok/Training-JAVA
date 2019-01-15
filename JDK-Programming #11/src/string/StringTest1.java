package string;

public class StringTest1 {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// 인스턴스가 매번 새로 생성되므로 str1 과 str2 의 주소 값이 다르다
		System.out.println(str1 == str2);    //false
		// 문자열 값은 같으므로 true 반환
		System.out.println(str1.equals(str2)); //true
	
		String str3 = "abc";
		String str4 = "abc";
	
		System.out.println(str3 == str4);  //true
		System.out.println(str3.equals(str4)); //true
	}
}
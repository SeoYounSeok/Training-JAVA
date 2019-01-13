package interfaceex;

public interface Calc {

	// 인터페이스 = 추상 메소드  + 상수 로만 이루어져있습니다.
	double PI = 3.14;
	int ERROR = -999999999;
	// public abstract 를 굳이 안써도 됩니다. 자동적으로 처리해준다.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

//	default void description(){
//		System.out.println("정수 계산기를 구현합니다");
//		myMethod();
//	}
//	
//	static int total(int[] arr){
//		
//		int total = 0;
//		
//		for(int i: arr){
//			total += i;
//		}
//		myStaticMethod();
//		return total;
//	}
//	
//	private void myMethod() {
//		System.out.println("private 메서드 입니다.");
//	}
//	
//	private static void myStaticMethod() {
//		System.out.println("private static 메서드 입니다."); }
}
	
package interfaceex;

// 클래스에서 인터페이스를 구현한다 (implements)
public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
}
// 아무것도 입력을 안했을 때
// 추상 메서드를 구현하세요.
// Calculator 클래스를 추상 클래스로 만드세요~ 라고 오류가 뜹니다.
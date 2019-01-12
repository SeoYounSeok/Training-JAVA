package abstractex;

public abstract class Computer {
	// 추상 메소드 -> 서브 클래스에서 재정의 해서 사용
	public abstract void display();
	public abstract void typing();
	// 구현 메소드 -> 공통적 업무로 적용
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}
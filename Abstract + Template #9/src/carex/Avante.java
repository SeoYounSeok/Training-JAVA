package carex;

public class Avante extends Car {
	// 추상 메소드 4개를 선언했다~ -> 재정의를 4개 해줘야합니다. 
	@Override
	public void start() {
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("Avante 시동을 끕니다.");
	}
}

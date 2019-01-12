package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();
		// 추상클래스는 인스턴스로 생성이 불가능합니다.
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
	}
}

// 간단하게 , 템플릿 메서드는 굳이 패키지를 생성안하고 설명하고 넘어가겠습니다
// 3학년 때, 디자인 패턴을 배운 것을 토대로 따로 정리할 것입니다.
// final public void car() {
//startCar();
//run();
//stop();
//turnOff();
// }  이런 코드를 작성하였다고 예를 들어보자.
// 템플릿 메서드는 실행 순서, 즉 시나리오를 정의한 메서드 입니다.
// 그렇다면 final 은 왜 쓴거죠??
// -> 상위클래스를 상속 받은 하위 클래스에서 템플릿 메서드를 재정의하면 안된다는 것입니다.

// final 을 좀 더 알아봅시다..
// 변수  : final 변수는 상수를 의미
// 메서드 : final 메서드는 하위 클래스에서 재정의 할 수 없습니다
// 클래스 : final 클래스는 상속할 수 없습니다.

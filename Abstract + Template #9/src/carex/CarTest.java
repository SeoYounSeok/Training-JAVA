package carex;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {

			ArrayList<Car> carList = new ArrayList<Car>();
			// 함수 정의를 똑바로 안해주면 add << 추가하는 부분에서 에러가 납니다.
			carList.add(new Sonata());
			carList.add(new Grandeur());
			carList.add(new Avante());
			carList.add(new Genesis());
			
			for(Car car : carList) {
				car.run();
				System.out.println("======================");
			}
		}
	}


// 디자인 패턴을 배울 때 이런식으로 추상 메서드를 많이 사용하기도 하지만, 인터페이스 또한 많이 사용합니다.

// 인터페이스는 10 장을 진행 할 때 공부하도록 합니다 !!
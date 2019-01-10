package thisex;


class BirthDay{

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		// 매개변수 값을 넣어주는 것
	}
	
	public void printThis() {
		System.out.println(this);  
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); // 태어난 년수 지정
		System.out.println(bDay.year); // 참조 변수 출력
		// 2번째 항 주석 처리하면 기본값 year = 0 ;
		bDay.printThis(); // this 출력 메서드 호출..
	}
}
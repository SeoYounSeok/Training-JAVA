package Lotto;

public class LottoPro {

	private boolean duplicate = false;
	private boolean can_bonus;
	private int[] numbers;
	
	
	// default 형 생성자 
	
	public LottoPro() {
		System.out.println("(System)보너스 추첨은 불가합니다.");
		can_bonus = false;
		
		// false 선언한 것이 6개까지만 번호를 출력한다.
	}
	
	// 인자가 있는 생성자를 선언했기 때문에, default 형 생성자를 생성해야 합니다. 그래서 위에 적어놨습니다.
	
	public LottoPro(boolean can_bonus) {
		// true 가 들어오면 생성을 하려고 합니다.  보너스 숫자를
		System.out.println("(System)보너스 추첨도 가능합니다.");
		can_bonus = this.can_bonus;
		
	}
	// 보기를 선택하였을때 나오도록 합니다.
	
	public void printNumber() {
		// 제일 먼저 넘버값이 없거나 0 이면 지금 없다고 출력합니다. 
		if(numbers == null || numbers[0] == 0) {
			System.out.println("(System)Empty Value");
			return ;
		}
		
		for(int i=0; i<numbers.length; i++) {
			if(i == 6) {
				System.out.print("(BONUS)>>>"+numbers[i]);
			} else {
				System.out.println(">>>"+ numbers[i]);
			}
		}
	}

	public int[] start_recommandation() {
		if(can_bonus) {
			numbers = new int[7];
		} else {
			numbers = new int[6];
		}
		
		
		// 함수를 호출하여 배열 함수에 저장 
		int [] imsi = getNormalNumber();
		
		
		for(int i =0; i< numbers.length; i++) {
			if(i == 6) {
				numbers[i] = getBonusNumber(numbers);
			} else {
				numbers[i] = imsi[i];
			}
		}
		return numbers;
	}
	
	private int getBonusNumber(int[] normal_number) {
		int bonus = 0 ;
		int imsi= 0;
		
		while (true) {
			imsi = (int)(Math.random()* 45 + 1);
			
			for (int j = 0 ; j< normal_number.length; j++) {
				if(normal_number[j] == imsi) {
					duplicate = true;
				}
			}
			if (duplicate) {
				duplicate = false;
				continue;
			} else {
				break;
			}
			
		}
		bonus = imsi;
		System.out.println("(System)Success Create Bonus Number");
		return bonus;
		
	}
	
	private int[] getNormalNumber() {
		int[] normal_number = new int[6];
		int imsi = 0;
		for(int i = 0; i< normal_number.length; i++) {
			imsi = (int)(Math.random()* 45 + 1);
			
			for (int j=0; j<i; j++) {
				if(normal_number[j]== imsi) {
					duplicate =true;
				}
			}
			
			if(!duplicate) {
				normal_number[i] = imsi;
			} else {
				duplicate = false;
				i--;
			}
		}
		System.out.println("(System)Success Create Normal Number");
		return normal_number;
	}
	
	
}

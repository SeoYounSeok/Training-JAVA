package Lotto;

public class LottoPro {

	private boolean duplicate = false;
	private boolean can_bonus;
	private int[] numbers;
	
	public LottoPro() {
		System.out.println("(System)보너스 추첨은 불가합니다.");
		can_bonus = false;
	}
	public LottoPro(boolean can_bonus) {
		System.out.println("(System)보너스 추첨도 가능합니다.");
		can_bonus = this.can_bonus;
		
	}
	
	public void printNumber() {
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

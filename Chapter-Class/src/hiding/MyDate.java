package hiding;

// Exercise 4

import java.util.Calendar;

public class MyDate {

	private int day;
	private int month;
	private int year;
	private boolean isValid = true;


    Calendar cal = Calendar.getInstance();
    int levels = cal.get(Calendar.YEAR);
    
    
	public String isValid() {
		
		if(isValid) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않은 날짜입니다.";
		}
	}
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	// getter 메소드
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (day <0 || day >31) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;
			case 4: case 6: case 9: case 11:
				if (day <0 || day >30) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;
				
				
		// 밑에 경우에는 공부를 더 할 필요가 있음 오답임!!		
			case 2:
				if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)){ 
					if (day <0 || day >29) {
						isValid = false;
					} 
					else {
						this.day = day;
					}
				}
				
				else {
					if (day <0 || day >28) {
						isValid = false;
					} 
					else {
						this.day = day;
					}
				}
				break;
		// default 값을 추가를 시켜줘야 합니다. 		
			default:
				isValid = false;
		}
	}



	public void setMonth(int month) {
		if( month <1 || month >12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}

    public void setYear(int year) {
		// 시간 지나면, 
		if (year > levels) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}
	

}


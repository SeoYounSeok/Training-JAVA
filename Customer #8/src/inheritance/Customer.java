package inheritance;


public class Customer {
	// 외부 클래스에서 사용이 불가능 , 하위 클래스에서는 사용할 수 있는 함수 = protected 
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	// 기본 생성자를 이런식으로 선언 안하고 super 을 사용해서 할 수 있음!!
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	// 여기서 알 듯이 생성자 호출은 상위 클래스가 먼저 호출
	//	System.out.println("Cusomer() 생성자 호출");
	}
	
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	//	System.out.println("Cusomer(int, String) 생성자 호출");
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo(){
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
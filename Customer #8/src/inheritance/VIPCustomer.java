package inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		//기본 생성자 생성안하고 this 로 선언한다면 에러가 납니다. 

		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;

	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID(){
		return agentID;
	}
	
	
}
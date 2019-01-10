package cardex;

public class Card {

	private int cardNumber;
	private static int serialNum = 10000;
	
	Card(){
		serialNum++;
		cardNumber = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	} //Getter 함수

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	} // Setter 함수

}
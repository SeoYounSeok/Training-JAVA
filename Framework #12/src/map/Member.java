package map;




// 모든 데이터는 키와 값이 존재한다.
// 키가 없이 값만 저장할 수 는 없다.
// 값이 없이 키만 저장할 수도 없다.
// 키는 해당 Map에서 고유해야만 한다.
// 값은 Map에서 중복되어도 전혀 상관 없다.
// 데이터 추가 순서는 중요하지 않다(데이터를 저장한 순서대로 결과가 출력되지 않는다).



public class Member {

	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName( ) {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " +  memberId + "입니다"; 
	}
}


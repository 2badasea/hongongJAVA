package sec01.exam01;

// 객체 동등 비교 equals() 메소드 p473
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // 매개값이 Member타입인지 확인
			Member member = (Member) obj; // Member타입으로 강제변환 후 
			if(id.equals(member.id)) {	// id필드값이 동일한지 검사하고 
				return true;			// 동일하다면 true를 리턴한다.
			}
		}
		return false; 
			// 매개값이 Member타입이 아니거나 id필드 값이 다른 경우 false를 리턴.
	}
}

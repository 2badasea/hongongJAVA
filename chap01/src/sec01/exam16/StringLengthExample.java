package sec01.exam16;

// 문자열의 문자 수 얻기
public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "9208031234567";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀렸습니다.");
		}
	}
}

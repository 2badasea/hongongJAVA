package sec01.exam19;

// 전부 소문나 또는 대문자로 변경
public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); // false가 나올 것이다. 
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		
		System.out.println(str1.equalsIgnoreCase(str2)); // true
			// equalsIgnoreCase()메소드의 경우 문자열을 맞춰주는 작업을 생략해준다.
	}
}

package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// 강제 타입 변환 예제. 
		int intValue =  44032;
		char charValue = (char) intValue; // (char)타입으로 캐스팅하게 되면 유니코드에 해당하는 문자를 출력할 수 있음.
		System.out.println("charValue: " + charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println("intValue: " + intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue: " + intValue);

	}

}

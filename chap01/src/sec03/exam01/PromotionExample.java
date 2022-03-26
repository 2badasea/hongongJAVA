package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;   // 44032가 출력된다. 왜냐하면 위에서 intValue의 자료형을 int타입으로 정의했기 때문.
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;  // F를 붙임 건, 실수형이 기본타입이 double이기 때문에, float형에 대입하기 위해선 F를 붙여야 함.
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

	}

}

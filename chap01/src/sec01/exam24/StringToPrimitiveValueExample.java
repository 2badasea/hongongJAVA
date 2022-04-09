package sec01.exam24;

// 문자열을 기본 타입 값으로 반환
public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		// 밑의 코드는 502페이지 포장값비교 부분.
		Integer obj1 = 100;
		Integer obj2 = 100;
		System.out.println(obj1 == obj2);
	}
}

package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// 정수 타입의 연산
		// int 타입보다 허용 범위가 큰 long타입이 피연산자로 사용되면 다른 피연산자는 무조건 long타입으로 변환되어 연산수행. 
		// 따라서 연산결과를 long타입에 저장해야 한다. 
		
		byte value1 = 10;
		int value2 = 20;
		long value3 = 30;
//		int result = value1 + value2 + value3; 컴파일 에러가 난다. 
		long result = value1 + value2 + value3; 
		System.out.println("result: " + result);
		
		
		

	}

}

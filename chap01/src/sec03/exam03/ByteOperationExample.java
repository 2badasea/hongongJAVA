package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 정수타입의 연산
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		/* 자바는 실행성능을 향상시키기 위해 컴파일 단계에서 연산을 수행. 30을 먼저 구한 다음 변수에 대입. 
		 * 피연산자가 변수가 아니므로 int타입으로 변환을 하지 않는다. */
		
		byte x = 10;
		byte y = 20;
		int result2 = x+y;  // 자동타입변환이 일어나는 시점.
		System.out.println(result2);
		/* 정수 연산식에서 모든 변수가 int 타입으로 변환되는 것은 아니다. 
		 * 두 피연산자 중 허용 범위가 큰 타입으로 변환되어 연산을 수행*/
		
		
	}

}

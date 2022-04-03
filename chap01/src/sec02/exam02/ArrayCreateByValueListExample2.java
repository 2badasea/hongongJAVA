package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 1. 배열을 별개로 선언하고, 다음 행에서 별개로 초깃값을 부여하는 경우. 
		int[] scores; // scores라는 배열 선언. scores는 참조변수. 해당 객체를 가리키는 값이다.
		scores = new int[] {83, 90, 87};
		int sum1  = 0;
		for(int i = 0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		// 2. 배열을 선언함과 동시에 초기화를 시키는 경우.
		int sum2 = add( new int[] {83, 90, 87} );
		System.out.println("총합: " + sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) {
		 int sum = 0;
		 for(int i= 0; i<3; i++) {
			 sum += scores[i];
		 }
		 return sum;
	}
}

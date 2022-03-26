package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//	float타입과 double타입
		
		// 실수값 저장
//		float var1 = 3.14;  // 컴파일 에러가 발생. 실수 리터럴의 기본 타입은 double이기 때문. 
		float var2 = 3.14F;  // 그래서 굳이 float변수에 담고 싶으면 뒤에 F를 붙인다. 
		double var3 = 3.14;  
		
		// e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;    // 2 *10의 마이너스세제곱. 
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		

	}

}

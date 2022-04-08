package sec02.exam04;

// 익명 객체의 로컬 변수 사용
public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {	// 매개변수
		final int var1 = 0;							// 로컬변수
		int var2 = 0;								// 로컬변수
		
		field = 10;
		
		//arg1 = 20;
		//arg2 = 20;  익명구현객체에서 사용중이기 때문에 final특성으로 인해 값변경 불가
		
		//var1 = 30;
		//var2 = 30;  
		
		Calculatable calc = new Calculatable() {  // 익명구현객체 생성
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2; 
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}

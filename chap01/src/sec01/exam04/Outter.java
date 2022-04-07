package sec01.exam04;

// 로컬 클래스에서 사용 제한 p415
public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;   자바7 이전엔 final키워드 없이 로컬변수를 사용하면 에러
		// localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable; 
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;  // final키워드 안 붙임. 그래도 final특성 부여됨
		// arg = 100;
		// localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}

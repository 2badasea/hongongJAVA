package sec01.exam03;

// 멤버 클래스에서의 사용 제한 p413
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {  // 인스턴스 멤버 클래스의 경우, 모든 필드와 메소드에 접근 가능
		void method() {
			field1 = 10;
			method();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C { // 정적 멤버 클래스에서는 정적 필드와 정적 메소드만 접근 가능.
		void method() {
			// field1 = 10;
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}

package sec01.exam02;

// 바깥 필드와 메소드에서 사용제한 p412
public class A {
	// 인스턴스 필드
	B field1 = new B();
	C filed2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
	// static B filed3 = new B();
	static C filed4 = new C();
	
	// 정적 메소드
	static void method2() {
		// B var1 = new B();
		C var2 = new C();
	}
	
	// 인스턴스 멤버 클래스 : 정적 필드와 메소드에서는 객체를 생성할 수 없음.
	class B {} 
	
	// 정적 멤버 클래스 : 모든 필드와 메소드에서 객체를 생성할 수 있음.
	static class  C {} 
}

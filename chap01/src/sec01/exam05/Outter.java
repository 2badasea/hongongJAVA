package sec01.exam05;

// 중첩 클래스에서 바깥 클래스 참조 얻기 p416
public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {			// 중첩 클래스
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);	// 중첩 객체 참조
			this.method();					// 중첩 객체 참조
			System.out.println(Outter.this.field);	// 바깥 객체 참조
			Outter.this.method();					// 바깥 객체 참조
		}
	}
}

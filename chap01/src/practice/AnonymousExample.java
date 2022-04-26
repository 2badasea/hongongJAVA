package practice;

// 익명구현 객체 생성
public  class AnonymousExample {
	
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		// 익명 객체 필드 사용
		anony.field.turnOn();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체를 매개값으로 사용
		anony.method2( new RemoteControl() {
			@Override 
			public void turnOn() {
				System.out.println("SmartTV를 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끈다.");
			}
		}
		);
		
	}
}

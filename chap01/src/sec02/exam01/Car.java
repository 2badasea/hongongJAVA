package sec02.exam01;

// 필드 다형성
public class Car {
	// 인터페이스 타입의 필드 선언과 초기 구현 객체 타입.
	// 필드 타입으로 타이어 인터페이스를 선언하면 필드값으로 한국타이어, 금호타이어 객체 모두 대입가능.
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	// 인터페이스에서 설명된 roll()메소드 
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

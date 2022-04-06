package sec02.exam02;

// 매개 변수의 인터페이스화
public class Driver {
	public void drive(Vehicle vehicle) {
		// dirve()메소드의 매개변수로 Vehicle 인터페이스 타입으로 선언
		vehicle.run();
	}
}

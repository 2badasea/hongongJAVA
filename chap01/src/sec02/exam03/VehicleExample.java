package sec02.exam03;

// 강제 타입 변환
public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();   // 자동타입변환이 일어났을 것이다. 
		
		vehicle.run();
		//vehicle.checkFare(); // vehicle 인터페이스에는 checkFare()가 없음.
		
		Bus bus = (Bus) vehicle; // 강제타입 변환함. 
		
		bus.run();
		bus.checkFare(); // Bus클래스에는 checkFare() 메소드 존재. 
	}

}

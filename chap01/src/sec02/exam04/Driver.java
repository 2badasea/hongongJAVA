package sec02.exam04;

import sec02.exam03.Bus;
import sec02.exam03.Vehicle;

// 객체 타입 확인 
public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		} 
		vehicle.run();
	}
}

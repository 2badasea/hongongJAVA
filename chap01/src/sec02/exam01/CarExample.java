package sec02.exam01;

// 필드 다형성 테스트
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		// kumhotire로 교체된 후에는 kumhotire객체의 roll()메소드가 실행됨.
		// Car의 run()메소드를 수정하지 않아도 다양한 roll()메소드 실행결과 얻음
		// => 필드의 다형성
		
		myCar.run();
	}

}

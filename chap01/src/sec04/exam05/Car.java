package sec04.exam05;

public class Car {
	// 필드
	int speed;
	
	// 생성자 ( 생략 => 기본생성자가 만들어질 것이다)
	
	// 메소드
	int getSpeed() {   // 반환되는 return타입이 int형. 
		return speed;
	}
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	void run() {
		for(int i = 10; i<= 50; i++) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
}

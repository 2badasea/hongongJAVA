package sec05.exam03;

// 정적 메소드 선언 시 주의할 점
public class Car {
	int speed;

	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {

//		speed = 60;  컴파일 에러가 나는 두 줄. 
//		run();
//		정적 메소드에선 인스턴스 필드와 인스턴스 메소드에 접근할 수 없기 때문
//		그래서 밑에서처럼 객체를 우선 생성해서 객체참조변수를 통해 접근해야 한다.
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}

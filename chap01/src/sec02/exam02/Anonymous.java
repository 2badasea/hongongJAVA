package sec02.exam02;

// 익명 구현 객체 생성
public class Anonymous {
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() { // 필드선언과 초기값대입
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};  // 하나의 실행문이므로 세미콜론을 붙여야 한다.
	
	void method1() {
		// 로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		// 로컬 변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}

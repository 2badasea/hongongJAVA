package practice;

// 익명 자식 객체 생성
public class Anonymous{
	
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};  // 세이콜론을 붙인 것에 주목하자. 하나의 실행문이다. 익명객체구현을 위한
	
	void method1() {
		// 로컬 변수값으로 대입
		RemoteControl locaVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		locaVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}  // 다른 클래스에서 method2를 호출하기 위해선 매개변수로 인터페이스 타입
	/*
	 * 구현 클래스를 명시적으로 선언하는 이유 -> 어디서건 이미 선언된 구현 클래스로
	 * 간단히 객체를 생성해서 사용할 수 있기 때문. 
	 * => 즉, 재사용성이 높기 때문이다.
	 * 그러나, 구현클래스가 굳이 재사용되지 않고, 특정 위치에서만 사용할 경우라면
	 * 굳이 구현클래스를 명시하는 것은 번거로운 일. 익명구현객체를 생성한다. 
	 * 인터페이스 타입의 필드|변수를 선언하고 new인터페이스() { }; 를 하면
	 * 익명의 구현 객체가 생성된다. 중괄호 안에는 인터페이스에 선언된 모든 추상메서드의
	 * 실체 메서드를 작성(재정의)해야 한다. 
	 * 익명구현객체를 생성하기 위해 사용하는 중괄호블록 {} 은 하나의 실행문이기에
	 * 마짐가에 세미콜론을 붙여야 한다. 
	 * 클래스 상속관계에서 부모(조상)에 RuntimeException이 있다면
	 * 실행예외클래스에 속한다고 보면 된다. 
	 */
}

package practice;

// 인터페이스 선언
public interface RemoteControl {
	public void turnOn();
	public void turnOff();
	
	// 위 두 메소드는 명시하지 않아도 추상메서드의 역할을 한다.
	// 인터페이스를 구현하는 클래스 내지 익명의 구현 객체 또한 위 메소드를
	// 반드시 재정의(오버라이딩)해야 한다.
	
}
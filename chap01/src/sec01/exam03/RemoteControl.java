package sec01.exam03;

// 상수 필드와 추상 메소드 선언
public interface RemoteControl {
	// 상수 :  인터페이스 상수의 경우 'static final'을 생략해도 된다.
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0; 
		// 생략하더라도 컴파일 과정에서 자동으로 생긴다.
	
	// 추상 메소드 : 인터페이스의 추상 메소드의 경우 public abstract생략 가능.
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
		// 추상메소드의 경우 메소드 선언부만 작성. 구현클래스에서 재정의해야 한다.
}

package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; // 상수이기 때문에 변수의 이름이 모두 대문자
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL; 
	
	@Override
	public void fly() {    // 부모클래스의 fly()메소드 재정의(오버라이딩)
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();  // 부모클래스의 메소드를 호출. 
		}
	}
}

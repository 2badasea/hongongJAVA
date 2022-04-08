package sec02.exam03;

// UI 클래스 
public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
				// 필드 값으로 익명객체 대입
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	// 생성자 ( 클래스이름과 동일하고, 리턴타입이 없다는 특징을 가짐
	Window(){
		button1.setOnClickListener(listener); // 매개값으로 필드대입
		button2.setOnClickListener(new Button.OnClickListener() {
				// 매개값으로 익명 객체 대입
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}

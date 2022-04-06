package sec05.verify.exam03;

public class ShopService {
	private static ShopService shopService = new ShopService();
//	2. 오답: 싱글톤 객체의 경우, '정적 필드'를 선언해야 한다. 
	
	//생성자 선언
	private ShopService() {};
	
//	private static  1. 오답: private을 선언하면 getInstance()메소드 호출 불가. 
	static ShopService getInstance() {
		return shopService;
	}
}

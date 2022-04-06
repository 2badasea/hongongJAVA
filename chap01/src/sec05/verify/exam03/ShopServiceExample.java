package sec05.verify.exam03;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		// ShopService에서  클래스멤버의 경우 접근할 때 클래스이름으로 접근한다. 
		// 물론 객체를 생성해도 되긴 하다. 
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니당.");
		} else {
			System.out.println("다른 ShopService 객체입니당.");
		}

	}

}

package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
//		위 2개는 컴파일 에러가 뜬다. 
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		// 이렇게 클래스 이름으로 접근하여 getInstance()를 호출해야 한다.
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");
		} else {
			System.out.println("서로 다른 singleton 객체입니다.");
		}
	}

}

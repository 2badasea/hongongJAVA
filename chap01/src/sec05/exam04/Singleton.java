package sec05.exam04;

// 싱글톤 p 280
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {};
	// 스스로 초기화. 명시적으로 생성자를 선언한 건 접근제한자 privage을 명시하기 위해
	
	static Singleton getInstance() {
		return singleton;
	}
}

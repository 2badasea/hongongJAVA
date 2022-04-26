package practice;


public class Practice {
	
	// throws키워드로 예외 떠넘기는 예제
	// main메소드에서 throws Exception 키워드를 사용하는 것은 바람직x
	public static void main(String[] args) {
		try {	
			findClass();
		} catch( Exception e) {
			e.printStackTrace();
			System.out.println("야호");
		} finally {
			System.out.println("최종처리 야호~ 정처기 빡공");
		}
	}
	
	public static void findClass() throws Exception {
		Class clazz = Class.forName("java.lang.String2");
	}
}

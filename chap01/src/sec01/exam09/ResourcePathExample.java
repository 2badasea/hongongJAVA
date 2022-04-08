package sec01.exam09;

import sec02.exam01.Car;

// 리소스 절대 경로 얻기
public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz = Car.class; // 클래스 이름으로 객체를 찾는 방식.
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}

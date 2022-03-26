package practice;

public class Example01 {

	public static void main(String[] args) {
		// 문자열 비교
		String strVar1 = "이바다";
		String strVar2 = "이바다";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2가 참조하는 게 같다.");
		} else {
			System.out.println("strVar1과 strVar2가 참조하는 게 다르다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("이바다");
		String strVar4 = new String("이바다");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		
		// 출력되는 값
//		strVar1과 strVar2가 참조하는 게 같다.
//		strVar1과 strVar2는 문자열이 같음
//		strVar3과 strVar4는 참조가 다름
//		strVar3과 strVar4는 문자열이 같음

		
	}

}

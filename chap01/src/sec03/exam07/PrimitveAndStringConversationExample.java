package sec03.exam07;

public class PrimitveAndStringConversationExample {
	
	public static void main(String[] args) {
		//기본타입과 문자열 간의 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		
		// 밑에는 String형태의 문자열로 변환되는 과정
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		
		// 문제: var1~var4까지 더해서 결괏값이 9가 result변수에 저장되도록 하기
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		double var5 = Double.parseDouble(var4);
		
		
		int result = (int)(var1 + var2) + (int)(var3 + var5);
		System.out.println(result);
	}
}

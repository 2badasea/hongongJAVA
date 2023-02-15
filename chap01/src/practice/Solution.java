package practice;

import java.util.Scanner;

public class Solution {
	// 싱글톤 생성해보기. 

	public static void main(String[] args) {
		Me obj1 = Me.getInstance();
		obj1.age = 32;
		System.out.println(obj1.info());
	}
}


// 싱글톤 클래스 생성
class Me{
	private static Me me = new Me();
	
	private String name = "leebada";
	int age = 0;
	
	String info() {
		return name + " 나이는 " + age + "입니다.";
	}
	
	// 생성자의 경우 private 접근제한자를 통해서 생성할 수 없도록 한다. 
	private Me() {};
	
	public static Me getInstance() {
		return me;
	}
}

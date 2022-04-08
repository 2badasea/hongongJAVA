package sec01.exam12;

import java.util.Scanner;

// 주민등록번호에서 남자와 여자를 구분하는 방법
public class StringCharAtExample {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String ssn = scn.nextLine();
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}

package practice;

import java.util.Scanner;

/*
 * while문과 Scanner를 이용해서 키보드로 입력된 데이터로
 * 예금, 출급, 조회, 종료 기능을 제공하는 프로그램 작성
 */
public class SummerPractice {
	static Scanner scn = new Scanner(System.in);
		
	public static void main(String[] args) {
		System.out.println("Welcome to Bada Bank");
		boolean b = true;
		int sum = 0; 
		while(b) {
			System.out.println("1. Input, 2. Output, 3. Select, 4. End ");
			String select = scn.nextLine();
			switch (select) {
			case "1":
				System.out.println("how much do you input?");
//				int inputMoney =  scn.nextInt();
				int inputMoney =  Integer.parseInt(scn.nextLine());
				sum = sum + inputMoney;
				break;
			case "2":
				System.out.println("how much do you Output?");
				int outputMoney =Integer.parseInt(scn.nextLine());
				sum = sum - outputMoney;
				break;
			case "3": 
				System.out.println("Now... your sum is.." + sum);
				break;
			case "4":
				System.out.println("bye");
				b = false; 
				break;
			default:
				break;
			}
		
		}
		
		
		
	}
}

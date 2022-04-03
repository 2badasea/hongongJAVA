package sec02.verify.exam06;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("=============================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("선택> ");
		
			int selectNo = Integer.parseInt(scn.nextLine()); 
//			  int selectNo = scn.nextInt();  // 는 왜 안 되는지?
//			  scn.nextLine();  //이렇게 하면 개행문자를 버퍼에서 없애주게 되어 정상적으로 출력된다. 
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if(selectNo == 3) {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("학생" + (i+1) + "의 점수: " + scores[i]);
				}
			} else if(selectNo == 4) {
				// 총합, 평균
				int sum = 0;
				for(int score : scores) {
					sum = sum + score;
				}
				System.out.println("점수총합: " + sum);
				double avg = (double) sum / scores.length;
				avg = Math.round(avg);   // 소수점 첫 째자리 까지 반올림하는 자바 메소드. 
				System.out.println("평균점수: " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		} // while문 끝
		
		System.out.println("프로그램 종료");
		
	}

}

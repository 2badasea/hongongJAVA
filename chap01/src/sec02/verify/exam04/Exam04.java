package sec02.verify.exam04;

public class Exam04 {

	public static void main(String[] args) {
		// for문을 이용해서 주어진 배열의 항목에서 최대값을 구한다.
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2};
		
		// 작성 위치
		for(int i = 0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max값 : " + max);
		// 내가 한 방식은 1을 하드코딩해서 임의로 삽입했다.
	}

}

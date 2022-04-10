package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

// 배열 전체 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		 Writer writer = new FileWriter("C:/Temp/text8.txt");
		 
		 char[] array = { 'A', 'B', 'C'};
		 
		 writer.write(array); // 배열의 모든 문자 출력
		 
		 writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력하고
		 writer.close(); // 출력스트림을 닫는다.
	}
}

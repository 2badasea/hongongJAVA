package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

// 배열 일부를 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F' };
		
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();
	}
}

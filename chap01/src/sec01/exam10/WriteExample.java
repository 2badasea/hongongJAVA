package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

// 문자열 출력하기 
public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "이바다짱짱";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}
}

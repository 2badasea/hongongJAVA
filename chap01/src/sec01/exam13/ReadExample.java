package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

// 지정한 길이만큼 읽기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5]; 
		
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {	// 읽은 문자가 있다면 
			for(int i = 0; i<buffer.length; i++) { // 배열 전체를 읽고 출력
				System.out.println(buffer[i]);
			}
		}
		reader.close(); // 입력스트림을 닫음
	}
}

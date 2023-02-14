package practice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// read() 메서드
public class ReadExample {
	// read()메서드는 끝의 1byte를 일고고 int타입으로 리턴한다.
	public static void 	main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3 );
		System.out.println("체크: " + readCharNum);
		if(readCharNum != -1) {
			for(int i = 0; i< buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}
}
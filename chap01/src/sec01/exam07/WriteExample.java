package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

// 한 문자씩 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 도착지를 매개값으로 하는 문자 기반 파일출력스트림 생성
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		// 한 문자씩 출력.
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close();	// 출력 스트림을 닫음
	}
}

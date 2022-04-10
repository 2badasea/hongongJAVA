package sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 1byte씩 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 C:/Temp/test1.db 로 하는 바이트 기반 파일출력스트림 생성
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1byte씩 출력.
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close();	// 출력 스트림을 닫는다.
	}
}

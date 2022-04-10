package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 배열 전체를 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		
		byte[] array = {10, 20, 30};
		
		os.write(array);	// 배열의 모든 바이트 출력
		
		os.flush(); 	// 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close();		// 출력 스트림을 닫는다
	}
}

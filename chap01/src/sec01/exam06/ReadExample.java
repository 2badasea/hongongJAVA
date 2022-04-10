package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

// 지정한 길이만큼 읽기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5]; // 길이가 5인 바이트 배열을 생성 
		
		// 입력스트림으로부터 3byte를 읽고 buffer[2], buffer[3], buffer[4]에 저장
		int readByteNum = in.read(buffer, 2, 3);
		if(readByteNum != -1) { // 읽을 바이트가 있다면~ 
			for(int i = 0; i<buffer.length; i++) { // 배열 전체를 읽고 출력
				System.out.println(buffer[i]);
			}
		}
		in.close(); // 입력스트림을 닫음. 
	}
}

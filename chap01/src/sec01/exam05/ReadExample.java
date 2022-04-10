package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

// 배열 길이만큼 읽기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:/Temp/test2.db");
		
		byte[] buffer = new byte[100]; // 길이가 100인 배열 생성
		
		while(true) {
			int readByteNum = in.read(buffer);// 배열 길이만큼 읽기
			if(readByteNum == -1) break;	// 파일 끝에 도달했을 경우
			for(int i = 0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		in.close();	// 입력 스트림을 닫는다.
	}
}

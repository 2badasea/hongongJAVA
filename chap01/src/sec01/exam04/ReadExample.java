package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

// 1byte씩 읽기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:/Temp/test1.db");
		while(true) {
			int data = in.read(); // 1byte씩 읽기. 
			if(data == -1)  	// 파일 끝에 도달했을 경우.
				break;
				System.out.println(data);
		}
		in.close();  // 입력스트림을 닫는다.
	}
}

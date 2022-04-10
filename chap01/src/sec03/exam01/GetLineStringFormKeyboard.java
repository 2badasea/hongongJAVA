package sec03.exam01;

import java.io.*;
// 키보드로부터 라인 단위 문자열 얻기 
public class GetLineStringFormKeyboard {

	public static void main(String[] args) throws Exception {
		// InputStream을 Reader로 변환하고 다시 BufferedReader를 연결
		InputStream in = System.in;
		Reader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader); // 보조스트림에 연결해야 readLine()메소드 가능
		
		while(true) {
			System.out.println("입력하세용: ");
			String lineStr = br.readLine(); // 라인 단위로 문자열 읽음. 
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.println("입력된 내용: " + lineStr);
			System.out.println();
		}
		br.close(); // 입력 스트림 닫기
	}
}

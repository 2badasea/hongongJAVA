package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// 연습용
public class NonBufferVsBufferedExample {

	public static void main(String[] args) throws Exception {
		// 성능향상 보조스트림을 사용했을 때와 사용하지 않았을 때의 차이 알아보기
		
		// 기본 스트림생성
		String originalFilePath1 = 
				NonBufferVsBufferedExample.class.getResource("originalFile1.jpeg").getPath();
		System.out.println("루피의 행방: " + originalFilePath1);
		String targetFilePath1 = "C:/Temp/targetFile1.jpeg"; // 루피 이미지로 실험 시작. 
		FileInputStream fis = new FileInputStream(originalFilePath1); // 바이트 기반 파일을 읽어들이는 스트림
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 버퍼 보조 스트림 연결 => 버퍼보조를 연결했을 때와 아닐 때와 성능을 비교하기 위함. 
		String originalFilePath2 = 
				NonBufferVsBufferedExample.class.getResource("originalFile1.jpeg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpeg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos); 
		System.out.println("버퍼를 사용하지 않았을 때 : " + nonBufferTime + " ");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 : " + bufferTime);
		
		fis.close();
		fos.close();
		fis2.close();
		fos2.close();
	}
	
		static int data = -1; 
		public static long copy(InputStream in, OutputStream os) throws Exception {
			long start = System.nanoTime(); 
			while(true) {
				data = in.read();
				if(data == -1) break;
				os.write(data);
			}
			os.flush();
			long end = System.nanoTime();
			return (end - start);
		}

}

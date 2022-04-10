package sec02.exam02;

import java.io.*;
// 파일 복사 성능 테스트 
public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		
		// 기본 스트림 생성
		String originalFilePath1 = 
			NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 버퍼 보조 스트림 연결
		String originalFilePath2 = 
			NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos); // 버퍼를 이용하지 않은 복사 시간 측정
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + " ns");
		
		long BufferTime = copy(fis2, fos2); // 보조 스트림 버퍼를 이용한 복사 시간 측정
		System.out.println("버퍼를 사용했을 때:\t" + BufferTime + " ns");
		
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
			long end = System.nanoTime();  // 끝 시간 저장
			return (end-start);
		}
	}

package sec03.exam03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

// File 클래스를 이용한 파일 및 폴더 정보 출력
public class FileExample {
	public static void main(String[] args) throws Exception {
		// 파일 객체 생성 4개
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		// 파일 또는 폴더가 존재하지 않으면 생성
		if(dir.exists() == false) {dir.mkdir(); }
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file2.exists() == false) { file2.createNewFile();}
		if(file3.exists() == false) { file3.createNewFile();}
		
		// C:/Temp 폴더의 내용 목록을 File배열로 얻음.
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles(); 
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {  // 파일 또는 폴더 정보를 출력하기 시작.
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

}

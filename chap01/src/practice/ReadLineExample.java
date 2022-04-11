package practice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadLineExample {
	
	public static void main(String[] args) throws Exception {
		// 오늘의 마지막 File클래스 예제 
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		// 파일 또는 폴더가 존재하지 않으면 생성하기
		if(dir.exists() == false) { dir.mkdir(); } 
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		// C:/Temp 폴더의 내용 목록을 File배열로 얻음. 
		File temp = new File("C:/Temp"); 
		File[] contents = temp.listFiles();
		// File[] listFiles() => 해당 폴더에 포함된 파일 및 서브 폴더 목록 전부를 File배열로 리턴.
		
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("-----------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {	// 파일 또는 폴더 정보를 출력하기 시작. 
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
package practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample  {
	
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "today is so hard to bada lee";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}
}

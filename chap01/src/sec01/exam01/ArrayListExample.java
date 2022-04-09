package sec01.exam01;

import java.util.*;

// String 객체를 저장하는 ArrayList
public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();   E타입 파라미터 생략하면 왼쪽 따라감. 
		
		list.add("JAVA");   // String 객체를 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("ORACLE");
		
		int size = list.size();   // 저장된 총 객체 수 얻기 
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2); // 2번 인덱스의 객체 얻기
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);		// 2번 인덱스 객체(Database) 삭제됨
		list.remove(2);		// 2번 인덱스 객체(Servlet/JSP) 삭제됨
		list.remove("ORACLE");
		
		for(int i = 0;  i< list.size(); i++) {  // 남아있는 총 객체 수만큼 루핑.
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}

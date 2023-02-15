package practice;

import java.util.HashMap;
import java.util.Map;

// 익명 자식 객체 생성
public class Anonymous{
	
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("String", "test");
		map.put(4, "test");
		map.put("55", 13);
		
		System.out.println( map.get("String"));
		System.out.println( map.get(4));
		System.out.println( map.get("55"));
		
	}
}

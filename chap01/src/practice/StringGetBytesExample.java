package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 바이트 배열로 변환
public  class StringGetBytesExample {
	public static void main(String[] args)  {
		// 전체 객체를 하나씩 모두 탐색하는 방법에는 두 가지 존재. keySet()메소드를
		// 통해서 set컬렉션에 담은 다음 반복자를 호출하는 방법이 있고, 
		Map<String, String> map = new HashMap<String,String>();
		map.put("javascript", "1234");
		map.put("java", "2341");
		map.put("oracle", "sqldeveloper");
		map.put("html", "web publisher");
		map.put("css", "web designer");
		map.put("yedam", "coding academy");
		map.put("mitani", "akari");
		map.put("momotani", "sarina");
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while( iterator.hasNext()) {
			 String key = iterator.next();
			 String value = map.get(key);
			 System.out.println(key + " : "  + value);
		}
		
		// 위의 방식이 첫 번째 방식.  두 번째 방식은 Set컬렉션 entrySet()
		// 이번의 예시 => map컬렉션에 아이디랑 비밀번호 담아서, 로그인 해보자. 
		Map<String, String> actor = new HashMap<>();
		actor.put("html", "100");
		actor.put("css", "80");
		actor.put("javascript", "100");
		actor.put("java", "70");
		actor.put("sqldeveloper", "50");
		actor.put("jquery", "100");
		actor.put("spring", "80");
		actor.put("react", "400");
		actor.put("spring", "70");
		actor.put("spring framework", "70");
		actor.put("spring boot", "100");
		actor.put("secure DBS", "100");
		
		Set<Map.Entry<String, String>> entrySet = actor.entrySet();
		Iterator<Map.Entry<String, String>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Map.Entry<String, String> entry = iterator2.next();
			String subject = entry.getKey();
			String score = entry.getValue();
			System.out.println(subject+ " : " + score);
		}
		map.clear();
		actor.clear();
		
		System.out.println("첫 번째 컬렉션 남은 객체 수 : " + map.size());
		System.out.println("두 번째 남은 객체 수 : " + actor.size());
		
		
	}
}

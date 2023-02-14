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
	/*
	 * map컬렉션의 경우 값으로 구성된 Map.Entry객체를 저장하는 구조다. 
	 * Enttry는 Map인터페이스 내부에 있는 중첩인터페이스라고 보면 됨다. 
	 * 
	 * ㅈ중요한 특징으로, key에 해당하는 것은 중복이 되지 않는다. 같은 키값으로 새로운
	 * 객체를 추가한ㄴ다면 value값이 변경되게 된다. 
	 * 객체를 검색하는 메소드로,boolean containsKey(Object key)
	 * containsValue(Object Value) 
	 * 하나 중요한 메소드가있다. Set<Map<String,String>> entrySet() 
	 * 메소드를 활용하면 키와값으로 구성된 Map.Entry 객체를 set컬렉션에 담을 수 
	 * 있다. 그리고 저장된 전체 객체를 대상으로 하나씩 얻고 싶은 경우에는 두 가지 방법이 존재한다
	 */
	
	/*
	 * 프로그램은 데이터를 읽고 출력하는 작업을 수행한다. 데이터를 읽고 출력하기 위해
	 * 사용되는 입출력 API를 알아본다.
	 * 자바에서는 스트림(Stream)을 토해서 입출력을 수행한다.
	 * 스트림은 단일 방향으로 연속적으로 흘러가는 것을 의미.
	 * 프로그램이 도착지면, 파일을 받아야 하는 통로를 스트림을 생성해야 되기 땜누에
	 * 입력스트림을 생성해야 한다. 하지만 프로그램에서 파일늘 내려받아야 하는 경우엔
	 * 통로를 생성하는 것이기 때문에 출력스트림을 생성해ㅑㅇ 한다.
	 * 무조건 집중하자. 입출력스트림 모두 복습하고, 다시 정처기로 돌아간다. 
	 */
	/*
	 * 일단 바이트byte기반의 스트림은 그림과 멀티미티어 등의 바이너리 데이터를 읽고 출력할 때 사용
	 * 그리고 문자charaater기반 스트림은 문자 데이터를 읽고 출력할 때 사용한다. 
	 * 바이트기반의 최상위 클래스는 InputStream, OutputStream
	 * 문자기반스트림의 최상ㅇ퀴 클래스는 Reader, Writer클래스다. 
	 * 
	 * 텍스트 기반 출력스트림의 경우, char[] 배열의 형태로 보내는 것이 기본이지만
	 * 문자열 통째로도 매개값으로 넣을 수 있따. 
	 * 
	 * 문자 출력 스트림의 경우 writer() 메소드를 사용하고
	 * 문자 입력 스트림의 경우 Reader() 메소드를 사용한다. 
	 * 모든 문자 입력스틞의 최상위클래스는 Reader 클래스로, 추상클래스다. 
	 * 하위 클래스로는 FileReader, BufferedReader 가 있다.
	 * 그리고 InputStreamReadaer
	 * Reader클래스에서 제공하는 대표적인 메소드로는  
	 * read()
	 * read(char[] cbuf); 
	 * int read(char[] cbuf, int off, int len); 
	 * len개의 문자를 읽고 매개값으로 주어진 문자 배열에서 cbuf[off]부터
	 * len개까지 저장한다. 그리고 읽은 문자 수를 리턴한다. 
	 * void close() 는 입력 스트림을 닫는다. 
	 * read() 메소드는 입력스트림으로부터 1개의 문자(2byte)를 읽고 int(4byte)
	 * 타입으로 리턴한다. 따라서 리턴한 4byte중 끝에 있는 2byte에 문자데이터가
	 * 들어가 있는셈이다. 
	 * 
	 * read(char[]] chuf) 메서드
	 * 해당 메소드는 입력스트림으로부터 매개값으로 주어진 문자 배열의 길이만큼
	 * 문자를 읽고 배열에저장한다. 그리고 읽은 문자 수를 리턴. 
	 * 
	 * 
	 * 
	 */
}

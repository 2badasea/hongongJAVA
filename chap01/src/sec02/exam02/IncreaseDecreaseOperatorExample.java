package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 증감 연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x: " + x);  
		
		System.out.println("---------------");
		y--;
		--y;
		System.out.println("y: " + y); 
		
		System.out.println("---------------");
		z = x++;
		System.out.println("z: " + z);  
		System.out.println("x: " + x);	
		
		
		System.out.println("---------------");
		z = ++x;
		System.out.println("z: " + z);  
		System.out.println("x: " + x);	
		
		System.out.println("----------------");
		z = ++x + y++;
		System.out.println("z: " + z);   
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		/*
		 * 문제를 틀린 이유는, 증감연산자도 결국 연산자이다. 세미콜론으로 끝나는 시점에서 증감이 되었다.
		 */
		
		
		
	}

}

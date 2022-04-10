package sec02.exam01;

import java.util.*;
// Stack을 이용한 동전 케이스
public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전을 동전케이스에 끼움
		coinBox.push(new Coin(100)); 
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
	
		while(!coinBox.isEmpty()) { // 동전케이스가 비어있는지 확인
			Coin coin = coinBox.pop(); // 제일 위에 있는 동전을 꺼냄.
			System.out.println("꺼내온 동전: "+coin.getValue()+"원");
		}
	}
}

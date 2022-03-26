package sec01.exam01;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 변수의 사용 범위
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;  에러가 나는 이유는 v2의 경우 if문 블록 안에서 선언된 로컬변수이기 때문 해당 블록이 실행되고 사라진다. 
	}

}

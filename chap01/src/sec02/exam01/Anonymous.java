package sec02.exam01;

// 익명 자식 객체 생성
public class Anonymous {
	// 필드 초기값으로 대입
	Person filed = new Person() {  // 필드값으로 익명 객체 대입
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	}; // 세미콜론을 사용해주어야 한다. 하나의 실행문에 해당하므로
	
	void method1() {
		// 로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		}; // 마찬가지로 세미콜론을 붙인다. 하나의 실행문이었으므로.
	
	// 로컬 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}

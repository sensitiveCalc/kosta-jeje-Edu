package ex0219.lamda;

public class MainApp {

	public static void main(String[] args) {
		// 1. 기존 방식
		/*AInterface ai = new Test();
		ai.aa();
		*/
		
		// 2. 익명 타입(AnnoymousInner type)으로 작성
		//AInterface ai = new Xxx() {}; 생성이 아닌 선언과 동시에 구현하는 것. 바디 { }를 열었기 때문, 1회성
		AInterface ai = new AInterface() {

			@Override
			public void aa() {
				System.out.println("AnnoymousInner aa 호출됨");
			}
		};
		ai.aa();
		
		// 3. 람다식
		// 3-1) AInterface ai = () -> { 기능 }
		AInterface ai2 = () -> {
			System.out.println("인수와 리턴 없는 람다식 호출");
		};
		ai2.aa();
		// 3-2) 기능이 한 문장일 때는 { }를 생략
		AInterface ai3 = () -> System.out.println("중괄호 없는 람다식 호출");
		ai3.aa();
		
		// 3-3) 인수가 있는 람다식
		BInterface bi = (a)-> System.out.println("전달된 a = " + a);
		bi.bb(3);
		
		// 3-4) 인수와 리턴이 있는 람다식
		/*CInterface ci = (c, d) -> c*d;
		int re = ci.cc(5, 20);
		System.out.println("re = " + re);
		*/
		CInterface ci = (c, d) -> { return c*d; }; // 곱셈과 return 두 문장으로 해석되어 중괄호를 써야 한다.
		int re = ci.cc(5, 20);
		System.out.println("re = " + re);
	}

}

/////////////////////////////////
class Test implements AInterface {

	@Override
	public void aa() {
		System.out.println("Test의 aa 구현메소드입니다.");
	}
	
}

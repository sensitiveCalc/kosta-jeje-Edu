package ex0213.과제.Interface.sec10;

public class PromotionExample {

	public static void main(String[] args) {
		
		//구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수 선언
		A a;
		
		//변수에 구현 객체 대입
		a = b; // B에서 A로 자동 타입 변환
		a = c;
		a = d;
		a = e;
		
	}

}

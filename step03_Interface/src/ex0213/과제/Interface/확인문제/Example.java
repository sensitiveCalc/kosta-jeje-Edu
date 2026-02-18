package ex0213.과제.Interface.확인문제;

interface A {
	public void method1();
}

public class Example {
	public static class B implements A {
		@Override
		public void method1() {
			System.out.println("B ~ method1()");
		}
		
	}
	public static class C implements A {
		@Override
		public void method1() {
			System.out.println("C ~ method1()");
		}
		public void method2() {
			System.out.println("C ~ method2()");
		}
	}
	
	public static void action(A a) { //A에는 method1()만 있음
		a.method1();
		//method2()만 출력되도록 조건식 입력
		if(a instanceof C c) { // a가 C의 객체라면
			//C c = (C) a; //C 타입으로 형변환
			c.method2();
		}
	}
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}

}

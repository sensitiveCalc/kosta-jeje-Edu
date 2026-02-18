package ex0213.과제.Interface.sec09;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		// 부모 인터페이스 변수에 선언된 객체는 부모 인터페이스의 추상 메소드만 호출 가능
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		// 자식 인터페이스 변수에 구현객체 대입. 자식 및 부모 인터페이스의 추상 메소드 모두 호출 가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}

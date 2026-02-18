package ex0213.과제.Interface.sec02;

public interface Service {
	
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon(); //중복코드 호출
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon(); //중복코드 호출
	}
	
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드 A");
		System.out.println("defaultMethod 중복 코드 B");
	}
	
	//static 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	// private static 메소드
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드 C");
		System.out.println("staticMethod 중복 코드 D");
	}
	
}

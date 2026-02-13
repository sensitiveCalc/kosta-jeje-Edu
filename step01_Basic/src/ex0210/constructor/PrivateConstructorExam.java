package ex0210.constructor;
/**
 * 	싱글톤 클래스 작성법
 *  1) private 생성자 작성
 *  2) private로 생성하면 외부클래스에서 생성하여 접근이 안 되므로 static 문법으로 접근한다.
 *  3) 자기자신을 생성하는 static 멤버필드 선언
 *  4) 멤버필드를 리턴하는 메소드 제공
 * 
 * */
class Test {
	
	private static Test t = new Test();
	
	// 외부에서 객체를 직접 생성하지 못하도록 막는다
	private Test() {}
	
	/**	현재 객체를 직접 생성해서 리턴해주는 메소드 제공
	 * 
	 * */
	public static Test getInstance() {
		return t; //이미 만들어진 t를 리턴
	}
}

public class PrivateConstructorExam {
	public static void main(String[] args) {
		Test t1 = Test.getInstance(); //싱글톤 패턴을 통해 하나의 주소값만 가리킴
		Test t2 = Test.getInstance();
		
		System.out.println("t1 = " + t1); //같은 주소값 출력
		System.out.println("t2 = " + t2);
		System.out.println("-------------------------");
		
		Test obj1 = Test.getInstance();
		Test obj2 = Test.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		
	}

}

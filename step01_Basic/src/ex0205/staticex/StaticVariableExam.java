package ex0205.staticex;

class Test {
	int a; //전역변수 0
	static int b; //static 전역변수 0
	
	// non-static 메소드에서는 static, non-static 접근가능
	public void aa() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(Test.b);
	}
	public void bb() {
		//메소드 호출
		aa();
		this.aa();
		
		cc();
		this.cc();
	}
	
	// static 메소드에서는 static만 접근 가능, this 사용불가
	public static void cc() {
		//System.out.println(a);
		//System.out.println(this.a);
		System.out.println(b);
		//System.out.println(this.b);
		System.out.println(Test.b);
	}
	public static void dd() {
		//aa();
		//this.aa();
		Test.cc();
		//this.cc();
	}
}

public class StaticVariableExam {
	static {
		System.out.println("메인보다 먼저 실행된다.");
	}
	public static void main(String[] args) {
		
		Test.dd();
		
		System.out.println("----메인 시작----");
		// 객체를 생성
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		System.out.println("\n--a static 접근--");
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
		System.out.println("\n--non-static 접근--");
		System.out.println("t1 = " + t1.a);
		System.out.println("t2 = " + t2.a);
		System.out.println("t3 = " + t3.a);
		
		// 값변경
		t2.a = 100;
		System.out.println("\n--a 변경 후 접근--");
		System.out.println("t1 = " + t1.a);
		System.out.println("t2 = " + t2.a);
		System.out.println("t3 = " + t3.a);

		System.out.println("\n--b static 접근--");
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
		System.out.println("\n--b non-static 접근--");
		System.out.println("t1 = " + t1.b);
		System.out.println("t2 = " + t2.b);
		System.out.println("t3 = " + t3.b);
		
		//t2.b = 100; 아래와 같은 문법
		Test.b=77;
		System.out.println("\n--b 변경 후 접근--");
		System.out.println("t1 = " + t1.b);
		System.out.println("t2 = " + t2.b);
		System.out.println("t3 = " + t3.b);
		
	}

}

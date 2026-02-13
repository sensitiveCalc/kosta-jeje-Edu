package ex0205.overloading;

class Test {
	public void aa(int ... i) { // ... = variable arguments: 매개값을 0개 이상 허용(배열처럼)
		System.out.println("aa 호출");
		System.out.println("i = " + i);
		
		for(int a:i) {
			System.out.print(a+" ");
		}
		
		System.out.println("\n--------------------------------------");
	}
	
	public void bb(int i, String ... s) {
		
	}
}

public class MethodVariableArgsExam {

	public static void main(String[] args) {
		// 메소드 호출
		Test t = new Test();
		t.aa(3);
		t.aa(3,4,6);
		t.aa(0);
		//t.aa(2.5); //타입이 맞아야 됨, 단 자료형 Object는 모든 타입 가능(=다형성)
		t.bb(4, "bbb", "b", "c");
	}
}


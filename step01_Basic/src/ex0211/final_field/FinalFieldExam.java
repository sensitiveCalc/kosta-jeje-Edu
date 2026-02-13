package ex0211.final_field;

public class FinalFieldExam {

	int i; // 인스턴스 필드
	
	// 객체를 생성하는 사용자가 객체를 생성할 때 값을 초기화 할 수 있다.
	// 객체가 생성되는 시점에 생성자를 통해 초기화 가능
	final int j; // 인스턴스 필드(final 필드는 반드시 명시적 초기화 해야한다. 자동 초기화 안됨)
	
	// 어떤 객체를 생성하든, 누가 사용하든 항상 동일한 값
	static final int k; // static 필드, 생성자에서 초기화 안되지만 static 클래스 안에서는 가능
	
	static {
		k=100;
	}
	
	public FinalFieldExam() {
		j = 10;
	}
	public FinalFieldExam(int j) {
		this.j=j;
	}
	
	public static void main(String[] args) {
		
		//static 필드 접근 시
		System.out.println(FinalFieldExam.k);
		
		//상수 접근 시
		//FinalFieldExam fe = new FinalFieldExam();
		FinalFieldExam fe = new FinalFieldExam(200); //생성자로 생성하면서 초기화 가능
		System.out.println(fe.i);
		System.out.println(fe.j);
		System.out.println(fe.k);
		
		//final은 고정값으로 값 변경 불가
		fe.i = 20;
		//fe.j = 100;
		//fe.k = 70;
	}

}

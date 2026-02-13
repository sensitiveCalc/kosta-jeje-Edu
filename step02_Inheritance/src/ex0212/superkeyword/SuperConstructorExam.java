package ex0212.superkeyword;

class Parent {
	
	Parent(int i) {
		System.out.println(2 + " | ");
	}
	Parent(String s) {
		System.out.println(3 + " | ");
	}
}
//////////////////////////////////////////////////////
class Child extends Parent { //Child는 Parent, Object이다
	Child( ) {
		super(10);
		System.out.println(4);
	}
	Child(int i) {
		this(true);
		System.out.println(5);
	}
	Child(boolean b) {
		super("안녕하세요");
		System.out.println(6);
	}
}

public class SuperConstructorExam {
	public static void main(String[] args) {
		//상속관계에 있으면 부모의 생성자를 가져옴. 자식 생성자마다 super()가 생략된 것과 같다
		//new Child(); // 1 4
		//new Child(10); // 1 5
		//new Child(true); //1 6
		
		// 만약, 부모의 생성자가 하나도 없다면 기본 생성자가 자동으로 삽입
		//new Child();
		//new Child(10);
		
		// 만약, 부모의 기본생성자가 없고, 다른 생성자를 추가했다면, 
		// this( ) 또는 super( )로 다른 생성자 선언해야 에러나지 않는다
		new Child();
		new Child(1);
	}

}

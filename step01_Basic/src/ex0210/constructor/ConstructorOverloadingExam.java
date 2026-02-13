package ex0210.constructor;
class Puppy3{
	/*String 타입 전역 변수 선언
	  int 타입 전역 변수 선언*/
	String name;
	int age;
	
	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	public Puppy3() {
		name = "메리";
		System.out.println("public Puppy3() 호출되었습니다.");
		System.out.println("전역변수 name = "+ this.name + ", age = " + age);
	}
	
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	Puppy3(String name) {
		this.name = name;
		System.out.println("public Puppy3() 호출되었습니다.");
		System.out.println("전역변수 name = "+ this.name + ", age = " + age);
	}
		
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/
	public Puppy3(String s, String s2) {
		this( s+s2 );
		System.out.println("puplic Puppy3(String s, String s2)호출되었습니다");
	}
	
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/
	public Puppy3(boolean i) {
		this(i+"쫑");
		System.out.println("puplic Puppy3(boolean i)호출되었습니다");
	}
	
	
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/			
	public Puppy3(char ch) {
		this(); //인수없는 생성자 호출(기본생성자)
		this.age = ch;
		System.out.println("puplic Puppy3(char ch) 호출되었습니다.");
		System.out.println("전역변수 age = " + ch);
	}
	
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
	public void printMemberVariable() {
		System.out.println("전역변수 name = " + name);
		System.out.println("전역변수 age = " + age + "\n");
	}
	
}

public class ConstructorOverloadingExam{
	//메인메소드에서
	public static void main(String [] args){
		//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
		System.out.println("========1.===========");
		Puppy3 puppy01 = new Puppy3( );
		
		System.out.println("========2.===========");
		Puppy3 puppy02 = new Puppy3("Java");

		System.out.println("========3.===========");
		Puppy3 puppy03 = new Puppy3("Java", "hello");
		
		System.out.println("========4.===========");
		Puppy3 puppy04 = new Puppy3(true);

		System.out.println("========5.===========");
		Puppy3 puppy05 = new Puppy3('A');
		
		// 주소값 출력
		System.out.println("-----주소값 출력------");
		System.out.println("전역변수 값 = " + puppy01);
		System.out.println("전역변수 값 = " + puppy02);
		System.out.println("전역변수 값 = " + puppy03);
		System.out.println("전역변수 값 = " + puppy04);
		System.out.println("전역변수 값 = " + puppy05);

		System.out.println("-----각 메소드 값 출력------");
		puppy01.printMemberVariable();
		puppy02.printMemberVariable();
		puppy03.printMemberVariable();
		puppy04.printMemberVariable();
		puppy05.printMemberVariable();
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			
	}
}
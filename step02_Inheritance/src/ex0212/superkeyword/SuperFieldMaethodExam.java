package ex0212.superkeyword;

class Animal {
	int age = 5;
	String bodyColor; //null
	public void sound() {
		System.out.println("super의 sound call ...");
	}
	public void eat() {
		System.out.println("super의 eat call ...");
	}
}

class Cat extends Animal { // Cat is a Animal 성립
	int age = 10;
	int weight;  // 0
	
	@Override
	public void sound() {
		System.out.println("Cat의 sound call ...");
	}
	public void run() {
		System.out.println("Cat의 run call ...");
	}
	public void test() {
		System.out.println("*****필드 test*****");
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println("----------------------------");
		
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		System.out.println("----------------------------");
		
		System.out.println(weight);
		System.out.println(this.weight);
		//System.out.println(super.weight); //다운캐스팅 필요
		System.out.println("----------------------------");
		
		System.out.println(this); //현재 this의 주소값 출력
		//System.out.println(super); //super만 단독으로 사용하지 못함
		
		System.out.println("\n****메소드****");
		sound();
		this.sound();
		super.sound();
		System.out.println("----------------------------");
		
		eat();
		this.eat();
		super.eat();
		System.out.println("----------------------------");
		
		run();
		this.run();
		//super.run(); //에러
		System.out.println("----------------------------");
	}
}

//////////////////////////////////////////////////////
public class SuperFieldMaethodExam {
	public static void main(String[] args) {
		//new Cat().test(); //생성과 동시에 메소드 선언=1회성
		
		System.out.println("---외부에서 객체를 생성하여 접근하기---");
		Cat cat = new Cat();
		System.out.println(cat.age);
		System.out.println(cat.bodyColor);
		System.out.println(cat.weight);
		
		cat.sound();
		cat.eat();
		cat.run();
		System.out.println("=========================");
		
		Animal an = new Cat(); //자식 캣을 부모 애니멀에 넣는다.=다형성, Animal부분만 접근가능한 제약이 따름
		System.out.println(an.age);
		System.out.println(an.bodyColor);
		//System.out.println(an.weight); //부모타입만 접근가능해서 자식부분 접근 불가
		
		an.sound(); //★★재정의된 메소드는 부모타입으로 접근하더라도 자식타입 메소드 호출
		an.eat();
		//an.run(); //재정의 되지 않아 에러

		System.out.println("=========================");
		System.out.println("an = " + an);
		// an으로 접근할 수 없는 자식부분을 접근하기 위해서는 ★ObjectDownCasting★이 필요하다
		if(an instanceof Cat) {
			Cat c = (Cat) an; //an안에 Cat 클래스가 존재하기 때문에 Cat으로 다운캐스팅이 가능한 것
			System.out.println("c = " + c);
			System.out.println(c.weight);
			c.run();
		}
		
		System.out.println("=========================");
		Animal a = new Animal();
		if(a instanceof Cat) { // a가 Cat으로 가능한지 물어보는 조건. 조건부가 만족하면 실행하고 그렇지 않다면 실행하지 않음
			System.out.println(111); // 출력 안됨
			Cat cc = (Cat)a; // 실행도중 ClassCastingException 발생, a에는 Cat 클래스가 존재하지 않기 때문에
		}
		System.out.println("***End***");
	}
}

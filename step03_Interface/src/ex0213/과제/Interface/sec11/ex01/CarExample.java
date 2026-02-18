package ex0213.과제.Interface.sec11.ex01;

public class CarExample {

	public static void main(String[] args) {
		//자동차 객체 생성
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("---------------------");
		
		//타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		//run( )메소드 다시 실행(=다형성: 실행 결과가 다름)
		myCar.run();
	}

}

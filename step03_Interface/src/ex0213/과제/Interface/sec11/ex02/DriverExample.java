package ex0213.과제.Interface.sec11.ex02;

public class DriverExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Driver driver = new Driver();
		
		//vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개값으로 구현 객체 대입(다형성: 실행 결과 다름)
		driver.drive(bus);
		driver.drive(taxi);
	}

}

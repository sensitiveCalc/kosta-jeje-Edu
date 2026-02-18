package ex0213.과제.Interface.sec11.ex02;

public class Driver {
	void drive(Vehicle vehicle) { // 매개변수를 통한 인터페이스 타입 선언
		vehicle.run(); //매개변수로 구현객체 생성 후 인터페이스 메소드 호출
		vehicle.checkFare();
	}
}

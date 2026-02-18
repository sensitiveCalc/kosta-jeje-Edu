package ex0213.과제.Interface.sec11.ex02;

public class InstanceofExample {
	public static void ride(Vehicle vehicle) {
		//매개값이 bus인 경우에만 강제로 타입 변환해서 checkFare() 메소드 호출
		if(vehicle instanceof Bus bus) {
			// Bus bus = (Bus) vehicle;
			bus.checkFare(); //=버스 승차요금을 체크합니다.
		}
		vehicle.run(); //=버스가 달립니다.
	}
	
	public static void main(String[] args) {
		//구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//ride( ) 메소드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
}

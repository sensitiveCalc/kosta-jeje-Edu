package ex0213.과제.Interface.sec11.ex02;

public class Bus implements Vehicle {

	public void run() {
		System.out.println("버스가 달립니다.");
	}
	//추가 메소드
	public void checkFare() {
		System.out.println("버스 승차요금을 체크합니다.");
	}
}

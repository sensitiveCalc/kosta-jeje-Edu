package ex0213.과제.Interface.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television(); //인터페이스를 통해 구현 객체 생성
		rc.turnOn(); //인터페이스의 추상메소드 호출
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		System.out.println("------------");
		
		rc = new Audio(); //Audio 객체로 교체 및 대입
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println("------------");
		
		//정적메소드는 구현 객체없이 인터페이스명으로 접근해서 호출 가능
		RemoteControl.changeBattery();
		
		//상수는 인터페이스 소속멤버이므로 바로 접근 가능
		//System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		//System.out.println("리모콘 최저 볼륨 : " + RemoteControl.MIN_VOLUME);
	}

}

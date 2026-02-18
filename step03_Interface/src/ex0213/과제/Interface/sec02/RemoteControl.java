package ex0213.과제.Interface.sec02;

public interface RemoteControl {
	
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상 메소드=선언부만 있고 실행부인 중괄호가 없는 메소드
	public void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
	//디폴트 인스턴스 메소드 = 구현 객체가 필요함
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드 구현
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
	
}

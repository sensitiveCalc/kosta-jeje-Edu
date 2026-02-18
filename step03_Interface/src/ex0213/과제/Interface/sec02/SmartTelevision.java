package ex0213.과제.Interface.sec02;

public class SmartTelevision implements RemoteControl, Searchable {
	//메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		
	}
}

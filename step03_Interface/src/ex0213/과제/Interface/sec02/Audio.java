package ex0213.과제.Interface.sec02;

public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끈다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			 this.volume = RemoteControl.MAX_VOLUME;
		 }else if(volume<RemoteControl.MIN_VOLUME) {
			 this.volume = RemoteControl.MIN_VOLUME;
		 }else {
			 this.volume = volume;
		 }
		 System.err.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	//setMute( ) 재정의
	private int memoryVolume; //추가 필드 선언
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("현재 오디오 볼륨은 " + memoryVolume + ", 무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
	
	
	
	
}

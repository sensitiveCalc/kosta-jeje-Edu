package ex0213.과제.Interface.sec02;

public class Television implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Tv를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끈다.");
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
		 System.err.println("현재 Tv 볼륨 : " + this.volume);
	}
}

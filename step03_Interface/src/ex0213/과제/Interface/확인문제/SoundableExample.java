package ex0213.과제.Interface.확인문제;

interface Soundable {
	public String sound();
}

public class SoundableExample {
	
	public static class Cat implements Soundable {
		@Override
		public String sound() {
			return "야옹";
		}
	}

	public static class Dog implements Soundable {
		@Override
		public String sound() {
			return "멍멍";
		}
	}
	
	public static void printSound(Soundable soundable){
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}

package ex0213;

import java.util.Random;

public class MainApp {
	public static void main(String[] args) throws AgeException {
		// 난수를 1~55사이 발생하여 쇼핑몰 클래스이 메소드를 10번 호출
		System.out.println("+++++ShoppingMall OPEN+++++");
		ShopMall spm = new ShopMall();
		int age = 0; //랜덤으로 받을 나이 변수 초기화
		
		for(int i=0; i<=10; i++) {
			// 난수발생 전용 클래스
			Random r = new Random();
			//cnt = (int) (Math.random() * 55) +1; //기존소스
			age = r.nextInt(55) +1;
			try {
				spm.enter(age);
			}catch(Exception e) {
				System.out.println(e.getMessage()); 
				//throw new AgeException("예외 발생 = " + i);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		System.out.println("에러는 총 " + AgeException.cnt + "번 발생했습니다.\n");
		System.out.println("+++++ShoppingMall CLOSE+++++");
	}

}

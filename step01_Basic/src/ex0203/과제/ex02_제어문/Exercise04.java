package ex0203.과제.ex02_제어문;

public class Exercise04 {

	public static void main(String[] args) {
		
		// 랜덤 메소드를 사용하여 두 개의 주사위를 던졌을 때 눈의 합이 5가 아니면 계속 주사위를 던지고, 합이 5가되면 멈추기
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		while(true) {
			num1 = (int) (Math.random() * 5) +1;
			num2 = (int) (Math.random() * 5) +1;
			result = num1 + num2;

			System.out.println(num1 + "," + num2);
			
			if(result == 5) {
				break;
			}
		}
	}

}

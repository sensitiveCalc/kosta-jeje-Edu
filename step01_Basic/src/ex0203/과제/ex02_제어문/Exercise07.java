package ex0203.과제.ex02_제어문;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// while문과 scanner를 이용해서 입력된 데이터로 예금, 출금, 조회, 종료 기능을 만들기
		
		boolean run = true; //상태변수 역할(반복문 실행여부를 판단하는 변수)
		int balance = 0; //잔액
		Scanner sc = new Scanner(System.in);
		
		while(run) { //run이 true일 동안 반복
			System.out.println("------------------------------");
			System.out.println("1. 예금 |" + "2. 출금 |" + "3. 잔고 |" + "4. 종료");
			System.out.println("------------------------------");
			System.out.println("선택 > ");
			
			String choiceNum = sc.nextLine();
			
			switch(choiceNum) {
				case "1":
					System.out.println("예금액> ");
					balance += Integer.parseInt(sc.nextLine());
					break;
				case "2":
					System.out.println("출금액> ");
					balance -= Integer.parseInt(sc.nextLine());
					break;
				case "3":
					System.out.println("잔고액> " + balance);
					break;
				case "4":
					System.out.println("종료");
					break;
			} //switch 종료
			System.out.println("프로그램 종료");
		} //while 종료
		
	}

}

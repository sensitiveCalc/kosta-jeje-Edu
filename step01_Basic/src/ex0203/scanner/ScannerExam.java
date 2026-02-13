package ex0203.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		//키보드 입력 받기 
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.println("이름:    2. 종료");
			 int nameList = sc.nextInt();
			 switch(nameList) {
				 case 1:
					 System.out.println("이름은? ");
					 String name = sc.next();
					 System.out.println("당신의 이름은 " + name + "입니다.");
					 break;
				 case 2:
					 System.out.println("종료합니다.");
					 System.exit(0); // 강제종료
				default:
					System.out.println("숫자는 1~2만 가능합니다.");
			 }
		 }
	}

}

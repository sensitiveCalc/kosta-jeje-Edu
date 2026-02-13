package ex0204.과제;

import java.util.Scanner;
/**
*   주제 : 성적표 프로그램
*   작성일 : 2026.02.04
*   작성자 : 이진주
*   
*/
public class ReportCard_ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReportCardLogic log = new ReportCardLogic(); // 한 번만 선언
		boolean run = true;
		
		while(run) {
			System.out.println("1. 성적표 구하기\t  2.종료");
			System.out.println("> ");
			int num = sc.nextInt();
			
			switch( num ) {
				case 1 -> {
					System.out.println("이름을 입력하세요.\n");
					String name = sc.next();
					
					System.out.print("국어: ");
					int kor = sc.nextInt();
					
					System.out.print("영어: ");
					int eng = sc.nextInt();
					
					System.out.print("수학: ");
					int math = sc.nextInt();
					
					log.printResults(name, kor, eng, math);
				}
				case 2 -> run = false;
				default -> System.out.println("1 또는 2만 입력 가능합니다.");
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}

// 성적표 로직
class ReportCardLogic {
	
	public void printResults(String name, int kor, int eng, int math) {

		int total = this.totalScore(kor, eng, math);
		double evg = (int)(everage(total, 3)*100) /100.0;
		char grade = grade(evg);
		
		System.out.println("------------------------------");
		System.out.println(name+"님의 성적표");
		System.out.println("국어: "+kor+"\n영어: "+eng+"\n수학: "+math+"\n---------------");
		System.out.println("총점: "+total+"\n평균: "+evg+"\n==========\n"+"★ 등급: "+grade +"\n");
	}
	
	/*	총점 구하기
	 * @parm: 국어, 영어, 수학
	 * 총점, 평균, 등급 구하기
	 * */
	// 1. 총점을 리턴하는 메서드
	private int totalScore(int kor, int eng, int math) {
		int total = kor+eng+math;
		return total;
	}
	
	// 2. 총점과 과목수를 인수로 받아 평균을 구하고 리턴하는 메서드
	private double everage(int total, int num) {
		double evg = total / num;
		return evg;
	}
	
	// 3. 평균을 인수로 받아 등급을 구하여 리턴하는 메서드
	private char grade(double evg) {
		char grade;
		switch( (int)evg/10 ) {
			case 9, 10 -> grade = 'A';
			case 8 -> grade = 'B';
			case 7 -> grade = 'C';
			case 6 -> grade = 'D';
			default -> grade = 'F';
		}
		evg = (int)(evg*100/100.0);
		
		return grade;
	}
}



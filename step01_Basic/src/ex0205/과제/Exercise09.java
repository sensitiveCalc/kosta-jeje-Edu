package ex0205.과제;
/**
 * 주제: 학생들의 점수를 분석하는 프로그램, 학생 수와 학생들의 점수를 입력받고,
 * 		  while문과 Scanner의 nextLine() 메소드를 이용해서 최고 점수 및 평균 점수를 출력하기
 * 작성일: 26.02.05
 * 작성자: 이진주
 * */
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int stdNo = 0; //학생수
		int score [] = new int[stdNo]; //학생 점수 배열
		Scanner sc = new Scanner(System.in); //입력 선언
		int idxLen = score.length; //입력받은 학생들의 점수 개수
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1. 학생수 | " + "2. 점수 입력 | " + "3. 점수리스트 | " + "4. 분석 | " + "5. 종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택 > ");
			
			String no = sc.nextLine();
			// int no = Integer.parseInt(sc.nextLine()); 이걸 변수로 쓸 수 없는 이유는 sc.nextLine 메서드가 바로 실행돼서
			switch(no) {
				case "1":
					System.out.print("학생수를 입력하세요. > ");
					stdNo = Integer.parseInt(sc.nextLine());
					score = new int[stdNo];
					System.out.println("학생수 = " + stdNo);
					break;
					
				case "2":
					if(score == null || score.length == 0) {
						System.out.print("먼저 학생 수를 입력하세요. > ");
						break;
					}
					for(int i=0; i<score.length; i++) {
						System.out.print("scores["+(i+1)+"]> ");
						score[i] = Integer.parseInt(sc.nextLine());
					}
					System.out.println("\n모든 점수 입력 완료");
					break;
					
				case "3":
					System.out.println("입력된 점수 리스트는 다음과 같습니다.");
					for(int i=0; i<score.length; i++) {
						System.out.println("scores["+ i +"]: "+ score[i]);
					}
					break;
					
				case "4": // 최고점수와 평균점수 나타내기
					int total = 0; // 총합
					int max = score[0]; //초기값을 첫번째 학생 점수로
					
					for(int i=0; i<score.length; i++) {
						total += score[i];
						if( score[i] > max ) {
							max = score[i];
						}
					}
					double evg = (double) total/score.length;
					System.out.println("최고 점수: " + max);
					System.out.println("평균 점수: " + evg);
					break;
				case "5": run = false; sc.close(); System.out.println("프로그램을 종료합니다.");
				default: System.out.println("1~5사이의 숫자만 입력해 주세요."); break;
			}
		}
	}

}

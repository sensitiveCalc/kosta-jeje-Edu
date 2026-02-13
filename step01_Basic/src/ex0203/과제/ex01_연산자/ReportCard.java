package ex0203.과제.ex01_연산자;

public class ReportCard {

	public static void main(String[] args) {
		// 1. 성적표 기능 클래스를 선언하고 메인메소드 작성
		// 메인메소드 안에서 하는 일
		// - 본인 이름을 저장할 변수 선언
		String myName = "이진주";
		
		// - 국어, 영어, 수학, 토탈의 랜덤 점수를 저장할 변수를 선언
		double random1 = (Math.random()*56 + 45);
		double random2 = (Math.random()*56 + 45);
		double random3 = (Math.random()*56 + 45);
		int kor = (int) random1;
		int eng = (int) random2;
		int math = (int) random3;
		int total = kor + eng + math;
		double evg = total/3; //평균
		char grade = 0; //학점

		if( evg >= 90 && evg <= 100) {
			grade = 'A';
		}else if( evg >= 80 && evg < 90 ){
			grade = 'B';
		}else if( evg >= 70 && evg < 80 ) {
			grade = 'C';
		}else if( evg >= 60 && evg < 70 ) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		int evg2 = (int) evg;
		switch(evg2) {
			case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> {
				grade = 'A';
			}
			case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 -> {
				grade = 'B';
			}
			case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> {
				grade = 'C';
			}
			case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 -> {
				grade = 'D';
			}
			default -> grade = 'F';
		};
		

		System.out.println(myName + "님의 성적표는 아래와 같습니다.\n");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + evg + "\n===========");
		System.out.println("등급: " + grade);
		
	}

}

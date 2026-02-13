package ex0203.과제.ex01_연산자;

public class ReportCard_수정 {

	public static void main(String[] args) {
		// 1. 성적표 기능 클래스를 선언하고 메인메소드 작성
		// 메인메소드 안에서 하는 일
		// - 본인 이름을 저장할 변수 선언
		String myName = "이진주";
		
		// - 국어, 영어, 수학, 토탈의 랜덤 점수를 저장할 변수를 선언
		int kor, eng, math;
		int total;
		double evg; //평균
		char grade; //학점
		
		kor = (int) (Math.random()*56) + 45;
		eng = (int) (Math.random()*56) + 45;
		math = (int) (Math.random()*56) + 45;
		
		//총점
		total = kor + eng + math;
		
		//평균
		evg = total/3.0;

		if( evg >= 90 && evg <= 100) {
			grade = 'A';
		}else if( evg >= 80 ){ // && evg < 90 는 이미 위에서 조건이 걸러졌기 때문에 작성할 필요없는 코드이다.
			grade = 'B';
		}else if( evg >= 70 ) {
			grade = 'C';
		}else if( evg >= 60 ) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		grade = switch( (int) (evg/10) ) { //int형으로 변환하고 평균값을 10으로 나눠 앞자리만 구분한다.
			case 9, 10 -> grade = 'A'; // { } 생략가능
			case 8 -> grade = 'B';
			case 7 -> grade = 'C';
			case 6 -> grade = 'D';
			default -> grade = 'F';
		}; // grade = 대입연산자가 있으므로 세미콜론으로 마무리한다.
		
		evg = (int) (evg*100)/100.0; // 100.0으로 하는 이유는 무한으로 떨어지는 수를 지우기 위해
		//evg = (int) (evg/0.01)*0.01;
		
		System.out.println(myName + "님의 성적표는 아래와 같습니다.\n");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + evg + "\n===========");
		System.out.println("등급: " + grade);
		
	}

}

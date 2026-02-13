package ex0203.과제.ex02_제어문;

public class Exercise05 {

	public static void main(String[] args) {
		//중첩 for 문을 이용하여 방정식 4x+5y = 60의 모든 해를 구해서 (x, y) 형태로 출력해보기. x와 y는 10이하의 자연수
		for( int x=1; x<=10; x++ ){
			for( int y=1; y<=10; y++ ){
				if(4*x+5*y == 60) { System.out.println("("+ x + ", " + y + ")"); }
			}
		}
		
		// 반복문 연습문제
		for( int x=0; x<=100; x+=5 ){// 0 5 10 15 ~~90 95 100
			for( int y=1; y<=10; y++ ){
				if( x == 100) {
					break;
				}
				System.out.print( (x+y) +"  "); // 96 97 98 ~~ 105
			}
			System.out.println();
		}
	}

}

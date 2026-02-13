package ex0203.과제.ex01_연산자;

public class Exercise08 {

	public static void main(String[] args) {
		// NaN 검사하기
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y; //나머지
		//boolean result1 = Double.isInfinite(z);
		//boolean result2 = Double.isNaN(z);
		//System.out.println("isinfinite 결과: " + result + "\nis NaN 결과: " + result2); // NaN
		
		if( Double.isNaN(z) ) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result); // NaN
		}
	}

}

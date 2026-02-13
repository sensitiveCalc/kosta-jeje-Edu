package ex0205.과제;
/**
 * 주제: 주어진 배열 항목의 전체 합과 평균을 구하여 출력(중첩 for문 사용)
 * 작성일: 26.02.05
 * 작성자: 이진주
 * */
public class Exercise08 {

	public static void main(String[] args) {
		int[ ][ ] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int len = array.length;
		int total = 0, totalLen = 0;
		
		for(int row=0; row<len; row++) {
			totalLen += array[row].length;
			for(int col=0; col<array[row].length; col++) {
				total += array[row][col];
				System.out.print("+" +array[row][col]);
			}
		}
		double evg = ((double)total/totalLen);
		System.out.println("\n----------------");
		System.out.println("전체 합 = " + total);
		System.out.println("전체 인덱스 개수 = "+ totalLen);
		System.out.println("평균 = " + evg);
	}

}

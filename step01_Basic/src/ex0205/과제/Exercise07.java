package ex0205.과제;
/**
 * 주제: 주어진 배열 항목에서 최대값을 출력하는 코드를 작성하기
 * 작성일: 26.02.05
 * 작성자: 이진주
 * */
public class Exercise07 {

	public static void main(String[] args) {
		int[ ] arr = {1, 5, 3, 8, 2};
		int max = arr[0]; //0번째 인덱의 값: 1
		int maxIndex = 0;
		
		for(int i=1; i<arr.length; i++) { //첫번째(인덱스0) 값부터 비교하니 인덱스1부터 비교 시작
			if(arr[i] > max) { //i가 max보다 크면
				max = arr[i]; // 현재 순회중인 i값을 max에 대입
				maxIndex = i; // 해당 i의 인덱스 값을 변수에 대입
			}
		}
		System.out.println("최대값은 = " + max);
		System.out.println("최대값 인덱스는 = " + maxIndex);
	}

}

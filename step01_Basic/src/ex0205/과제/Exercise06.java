package ex0205.과제;
/**
 * 주제: 배열 길이를 출력하는 코드를 작성하기
 * 작성일: 26.02.05
 * 작성자: 이진주
 * */
public class Exercise06 {

	public static void main(String[] args) {
		int[ ][ ] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		System.out.println(array.length); // 2차원 배열의 개수 = 3
		System.out.println(array[2].length); // 1차원 3행의 열 개수 = 5
	}

}

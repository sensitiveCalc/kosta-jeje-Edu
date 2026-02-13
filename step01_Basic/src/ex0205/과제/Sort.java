package ex0205.과제;
/**
 * 주제: 정렬 알고리즘(버블, 선택, 삽입)
 * 		  버블: 인접한 인덱스끼리 비교하여 정렬
 * 		  선택: 남은 배열에서 가장 작은 값을 찾아 맨 앞에 정렬
 * 		  삽입: 정렬된 부분에 새 값을 끼워넣기
 * 작성일: 26.02.05
 * 작성자: 이진주
 * */
public class Sort {

	public static void main(String[] args) {
		int arr[] = {5, 7, 1, 2, 4, 3, 8, 10, 6, 9};
		int n = arr.length;
		// 오름차순으로 데이터 정렬하기
		
		//선택정렬
		for(int i=0; i<n-1; i++) { // 10-1 = 9, i는 현재 정렬할 인덱스 위치, n-1을 하는 이유는 마지막은 이미 정렬되었기 때문에 반복할 필요없어서
			int min = i; //가장 작은 인덱스 값
			for(int j=i+1; j<n; j++) { // i+1부터 끝까지 반복 -> 현위치 이후 인덱스들 검사
				if(arr[j] < arr[min]) { // 그 인덱스들 중 j가 최소값인 min보다 작으면
					min = j; //min값을 j로 변경
				}
			}
			int temp = arr[i]; // temp는 임시저장소
			arr[i] = arr[min]; // 최소값을 현재위치 i번째 인덱스 값과 교환
			arr[min] = temp; // temp에 저장된 임시값은 min에 넣는다
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}

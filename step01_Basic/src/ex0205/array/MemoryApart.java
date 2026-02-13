package ex0205.array;

/*	
 * 2차원 배열 만들기
 * 
 * */
class MultiArray{
//정수형 2차원 배열 8*9
	
//메소드이름 :array99
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
	public void array99() {
		int arr2 [][] = new int [][] {
			{1, 2, 3},
			{3, 5, 7, 9, 11},
			{5, 10, 15, 20}
		};
		System.out.println(arr2); // 2차원배열 주소
		System.out.println(arr2[0]); // 1차원배열 주소
		System.out.println(arr2[1][0]); // 0
		
		for( int row=0; row<arr2.length; row++ ) { //3행
			for( int col=0; col<arr2[row].length; col++) { //각 행의 열의 길이만큼
				System.out.print(arr2[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----2차원 배열 만들기-----");
		//=====2차원 배열 만들기=====
		int arr [][] = new int [8][9];
		for( int row=0; row<arr.length; row++){
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = (row+2) * (col+1);
				System.out.print(arr[row][col]+ " "); // [n행][n열] = 2차원 배열의 인덱스 = 값
			}
			System.out.println();
		}
		
		System.out.println("\n---개선된 for문----");
		for(int[] row : arr) { //1차원 행을 먼저 꺼내고
			for(int col : row) { //1차원 열은 행을 순회한다.
				System.out.print(col+ " ");
			}
			System.out.println();
		}
	}
		
}
public class MemoryApart{
//main메소드에서 
//MultiArray객체의 array99메소드호출
	public static void main(String[] args) {
		MultiArray arr = new MultiArray();
		arr.array99();
	}
}


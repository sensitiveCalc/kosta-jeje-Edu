package ex0205.array;

/*	
 * 1차원 배열 만들기
 * 
 * */
class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //멤버필드 명시적 초기화
	//int arr[];

   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
	*/
	public void printArrayvalue() {
		System.out.println("arr= " + arr[0]); //초기화 없이 선언하면 Nullpoint Exception 에러 발생
		
		int len = arr.length;
		System.out.println("배열의 길이 = " + len);
		
		for(int i=0; i<len; i++) {
			System.out.println("arr=["+i+"]" + arr[i]);
		}
		
		//배열방 값 변경
		arr[5] = 5000;
		System.out.println("\n--배열값 변경 후--");
		for(int i=0; i<len; i++) {
			System.out.println("arr=["+i+"]" + arr[i]);
		}
		
		System.out.println("\n----향상된 for문----");
		for(int i : arr) {
			System.out.println(i);
		}
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		//new ArrayValue().printArrayvalue(); //변수에 담지 않고 생성하면 단순히 한번만 호출하고 끝남(재사용 못함)
		
		ArrayValue printArr = new ArrayValue();
		printArr.printArrayvalue();
		
		System.out.println("프로그램 종료");
	}
}
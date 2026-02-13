package ex0204.과제;

public class Star {

    public static void main(String[] args) {

        int max = 5;
        
        //이중 for문을 감싸는 삼중 for문
        for(int phase=0; phase<2; phase++) {
	        for (int i = 1; i <= max*2; i++) {
	            int count;
	            if (i <= max) { //1, 2, 3, 4, 5
	                count = i;
	            } else { //5, 4, 3, 2, 1
	                count = (max*2) - i +1; // i가 6일 때 -> count는 (5*2)-6+1 = 5
	            }
	
	            if ( i%(max+1) == 0 && i != 1) { //6의 배수 위치에 입력 & count가 1이 되는 위치 구분
	                System.out.println("**************************************");
	            }
	            
	            // 1️. 왼쪽 정렬 별찍기
	            if(phase==0) {
	            	for (int j = 0; j < count; j++) {
		                System.out.print("★");
		            }
	            }else {
	            	// 2. 오른쪽 정렬 별찍기
		            // 공백 먼저 출력(max-count)
		            for (int s = 0; s < max-count; s++) { //max=5; count=1;
		                System.out.print("   "); // 공백 4개부터 시작
		            }
		
		            // 별 출력
		            for (int j = 0; j < count; j++) { // count=1; 부터 시작
		                System.out.print("★"); // 별 1개부터 시작
		            }
	            }
	            System.out.println();
	        }
	        if (phase == 0) {
	            System.out.println("**************************************");
	        }

        }
    }
}

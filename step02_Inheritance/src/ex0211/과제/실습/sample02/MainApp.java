package ex0211.과제.실습.sample02;

public class MainApp {
	/**
	 * @param args
	 */
		public static void main(String[] args) {
		
			Employee [] emp = new Employee[5]; //Employee타입의 배열을 생성
	
			
			emp[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
			emp[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
			emp[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
			
			emp[3] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
			emp[4] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
			
			//출력화면을 보고 코딩...
			System.out.println("**********************Emp 정보**********************");
			for(int i=0; i<emp.length; i++) {
				Employee f = emp[i];
				
				// 부모타입이라도 재정의된 메소드는 자식 메소드(=재정의된)가 호출된다
				System.out.println(f); //employee.toString() 호출
			}

			System.out.println("\n**********************사원 정보**********************");
			for(int i=0; i<emp.length; i++) {
				Employee f = emp[i];
				f.message();
			}
			
			// 개선된 for문
			//for( 타입 변수 : 반복대상)
			/*
			for(Employee emp : Employee) { //순회하기 좋음. 단 인덱스 관리는 힘듦
				System.out.println(emp);
			}*/
		}
}







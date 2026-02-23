package ex0223.io;

class Test implements AutoCloseable {
	public void close() {
		System.out.println("Test의 close 호출됨");
	}
}

public class AutoCloseableExam {

	public static void main(String[] args) {
		System.out.println("----------시작합니다.-----------");
		try (Test t = new Test()){ //try ( )괄호 안에서 Test 클래스를 생성하면 그 안의 close가 호출되면서 자동으로 종료된다.
			System.out.println("오늘은 월요일");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------종료합니다.-----------");
	}
}

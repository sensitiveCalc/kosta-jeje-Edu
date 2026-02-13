package ex0213;

public class AgeException extends Exception { //체크예외: 예외처리 필수
//public class AgeException extends RuntimeException { //비체크예외: 예외처리 선택
	static int cnt; //공유변수로 예외가 발생할 때마다 카운트 증가
	public AgeException(String message) {
		super(message);
		cnt ++;
	}

	public AgeException() {
		super("애들은 가라");
		cnt ++;
	}
	
}

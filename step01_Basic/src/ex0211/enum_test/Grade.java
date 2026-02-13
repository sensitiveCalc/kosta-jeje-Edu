package ex0211.enum_test;
/**
 * 고객의 등급을 정리하는 프로그램
 * enum은 열거형으로 안에 정의된 정보는 static final 상수이다.
 * */
public enum Grade {
	//BASIC, SILVER, GOLD;
	
	//상수지만 생성자를 통해 값 초기화 가능
	BASIC(0, "일반"), SILVER(1, "우수"), GOLD(2, "최우수");
	
	private final int code;
	private final String name;
	
	Grade(int code, String name){ //상수이므로 접근제한자 기본이 private이다
		this.code = code;
		this.name = name;
	}

	// 위 클래스를 사용하기 위해 get메소드를 사용한다
	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}

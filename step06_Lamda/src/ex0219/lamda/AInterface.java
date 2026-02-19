package ex0219.lamda;

@FunctionalInterface // 메소드 단 한 개 선언
public interface AInterface {
	void aa();
	default void bb() { //default or static을 선언하면 가능
		
	}
}

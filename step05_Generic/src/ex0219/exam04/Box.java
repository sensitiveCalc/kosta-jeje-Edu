package ex0219.exam04;

// 제네릭을 사용한 경우
public class Box<T> {
	private T content;

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
	
	//제네릭 메소드
	public <A, B> T eest(A a, B b) {
		return null;
	}
}


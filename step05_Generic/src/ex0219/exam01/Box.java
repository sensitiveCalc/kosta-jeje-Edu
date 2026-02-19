package ex0219.exam01;
/*
public class Box {
	private Object content;

	public void setContent(Object content) {
		this.content = content;
	}

	public Object getContent() {
		return content;
	}
}*/

// 제네릭을 사용한 경우
public class Box<T> {
	private T content;

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
}


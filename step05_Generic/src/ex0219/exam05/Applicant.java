// 신청 - 누가 신청을 하느냐?
package ex0219.exam05;


public class Applicant<T> {
	private T kind; // 사람, 직장인, 학생, 고등부, 중등부

	public Applicant(T kind) {
		this.kind = kind; //kind를 구체적으로 타입 명시
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}
}

package ex0212.과제;
/**
 * 주제: tv와 오디오 출력 프로그램의 필드 생성
 * 작성일: 26.02.12
 * 작성자: 이진주
 * */
public class Elec {
	
	private String code;
	private int cost;

	public Elec() {}
	public Elec(String code, int cost) {
		super();
		this.code = code;
		this.cost = cost;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(code);
		return builder.toString();
	}
	
	
}

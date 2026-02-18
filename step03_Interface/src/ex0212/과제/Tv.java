package ex0212.과제;
/**
 * 주제: tv와 오디오 출력 프로그램의 tv 필드 생성
 * 작성일: 26.02.12
 * 작성자: 이진주
 * */
public class Tv extends Elec implements ElecFunction {
	
	private int chnnel;
	public Tv() {}
	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
	}

	public Tv(int chnnel) {
		super();
		this.chnnel = chnnel;
	}

	public void setChnnel(int chnnel) {
		this.chnnel = chnnel;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("제품의 TV를 ");
		builder.append(chnnel + "번을 본다.");
		return builder.toString();
	}

	@Override
	public void start() {}

	@Override
	public void stop() {}

	@Override
	public void display() {}
}

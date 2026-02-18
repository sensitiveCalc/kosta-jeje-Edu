package ex0212.과제;
/**
 * 주제: tv와 오디오 출력 프로그램의 오디오 필드 생성
 * 작성일: 26.02.12
 * 작성자: 이진주
 * */
public class Audio extends Elec implements ElecFunction {
	private int volumn;
	public Audio() {}

	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	public Audio(int volumn) {
		super();
		this.volumn = volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("의 Audio를 ");
		builder.append(volumn + "으로 듣는다.");
		return builder.toString();
	}

	@Override
	public void start() {}

	@Override
	public void stop() {}

	@Override
	public void display() {}
	
}

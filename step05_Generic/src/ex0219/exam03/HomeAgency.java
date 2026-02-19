package ex0219.exam03;

//구현객체가 만들어 질 때 오버라이딩하는 메소드도 같은 타입으로 생성됨
//선언하는 시점에는 모르고 사용하는 시점에 확인
public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}

}

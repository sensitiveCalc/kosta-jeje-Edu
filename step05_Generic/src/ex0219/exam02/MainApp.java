package ex0219.exam02;

public class MainApp {

	public static void main(String[] args) {
		//상품 생성
		Product<Tv, String> p1 = new Product<>(); //기본형을 객체로 전환
		p1.setKind(new Tv());
		p1.setModel("삼성tv");
		
		Tv tv = p1.getKind(); //객체를 기본형으로 전환
		////////////////////////////////////////////////////////////////////////
		
		//제네릭은 반드시 객체타입이어야 한다. int(primitive type) 기본형은 사용이 안 됨
		//autoBoxing -> 기본 타입을 포장 클래스로 바꿔서 선언.( ex) char -> Character )
		// unBoxing -> 객체를 기본형으로 변환
		Product<Video, Integer> p2 = new Product<>();
		p2.setKind(new Video());
		p2.setModel(100); // autoBoxing
		
		Video v = p2.getKind();
		int it = p2.getModel(); //언박싱
		
	}

}

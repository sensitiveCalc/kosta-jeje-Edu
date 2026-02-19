package ex0219.exam01;

public class MainApp {

	public static void main(String[] args) {
		//제네릭을 사용하지 않은 경우
		/*
		Box box = new Box();
		box.setContent("상품1");
		
		//String 타입이 아닐 경우 분기처리
		//String str = (String) box.getContent();
		if( box.getContent() instanceof String s ) {
			//String 접근
		}
		
		box.setContent(new Board());
		Board board = (Board) box.getContent();
		*/
		
		///// Box에 제네릭을 사용한 경우 - 제네릭 타입 /////
		Box<String> box = new Box<>();
		box.setContent("상품1");
		String str = box.getContent();
		
		Box<Board> box2 = new Box<Board>();
		box2.setContent(new Board());
		
		Board b = box2.getContent();
		
		//////////////////////////////////////////////////////////
		Box<Object> box3 = new Box();
		box3.setContent(new Board());
		Board b2 = (Board) box3.getContent();
	}

}

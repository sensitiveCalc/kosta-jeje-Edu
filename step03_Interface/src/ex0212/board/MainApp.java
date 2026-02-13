package ex0212.board;

public class MainApp {
	//필드를 이용한 다형성
	BoardService service; // UploadServiceImpl or FreeServiceImpl or QaBoardServiceImpl이 올 수 있음
	Board board; // UploadBoard or QaBoard or UploadBoard가 올 수 있음
	
	public MainApp() {
		service = new FreeBoardServiceImpl();
		board = new FreeBoard(10, "제목", "작성자", "내용");
		test(service, board);
		
		service = new QaBoardServiceImpl();
		board = new QaBoard(200, "qa제목", "qa작성자", "qa내용", false);
		test(service, board);
		
		service = new UploadBoardServiceImpl();
		board = new UploadBoard(300, "upload 제목", "upload 작성자", "upload 내용", "b.txt");
		test(service, board);
	}
	
	// 매개변수를 이용한 다형성
	public void test(BoardService service, Board board) { //자식의 메서드를 재정의하여 선언
		//현재 서비스가 갖고있는 서비스를 호출
		service.insert(board);
		service.update(board);
		service.selectByNo(5);
		
		//default메소드 호출
		service.delete(5);
		
		//static메소드 호출
		BoardService.selectAll();
		
		System.out.println("\n================\n");
	}
	
	public static void main(String[] args) {
		new MainApp();

	}

}

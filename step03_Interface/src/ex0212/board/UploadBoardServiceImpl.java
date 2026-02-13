package ex0212.board;
/**
 * 업로드 게시판 비즈니스 로직 담당 클래스
 * */
public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("upload  = " + board);
		System.out.println(super.getClass().getSimpleName() + " inesrt 화면입니다."); //현재 클래스 이름을 가져온다
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("upload  = " + board);
		System.out.println(super.getClass().getSimpleName() + " update 화면입니다."); //현재 클래스 이름을 가져온다
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println(super.getClass().getSimpleName() + " selectByNo 화면입니다."); //현재 클래스 이름을 가져온다
		return new UploadBoard(30, "업로드 게시판 테스트", "jeje", "파일첨부했어요", "a.jpg");
	}

}

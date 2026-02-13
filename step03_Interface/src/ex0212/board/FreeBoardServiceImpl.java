package ex0212.board;
/**
 * 자유게시판 비즈니스 로직 담당 클래스
 * */
public class FreeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("free  = " + board);
		System.out.println(super.getClass().getSimpleName() + " insert 화면입니다."); //현재 클래스 이름을 가져온다
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("free  = " + board);
		System.out.println(getClass().getSimpleName() + " update 화면입니다."); //현재 클래스 이름을 가져온다
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println(getClass().getSimpleName() + " selectByNo 화면입니다."); //현재 클래스 이름을 가져온다
		return new FreeBoard(20, "수업중", "jeje", "프리보드 테스트 중");
	}
	
	@Override
	public int delete(int no) {
		System.out.println(getClass().getSimpleName() + " delete 화면입니다."); //현재 클래스 이름을 가져온다
		return 10;
	}

}

package ex0210.과제;

public class MemberService {

	public static void main(String[] args) {

		MemberService memberService = new MemberService( );
		boolean result = memberService.login("hong", "12345");
		if( result ) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}
	
	// 전역 변수 선언
	String saveId = "hong";
	String savePwd = "12345";

	// login method
	public boolean login(String id, String password) {
		//String 타입은 주소값을 equals로 비교한다. 권장 코드
		if( "hong".equals(id) && "12345".equals(password) ) {
			return true; //true일때만 반환
		}
		
		/* 아래 코드는 NullpointException을 반환할 확률이 높다.
		 * 사용자 입력으로 들어오기 때문에 잘못된 값이 들어올 수 있다.
		 * if( saveId.equals(id) && savePwd.equals(password) ) { return true; //true일때만
		 * 반환 }
		 */
		return false;
	}

	// logout method
	public void logout(String id) {
		if( saveId.equals(id) ) {
			System.out.println(id + "님이 로그아웃 되었습니다.");
		}
	}

}

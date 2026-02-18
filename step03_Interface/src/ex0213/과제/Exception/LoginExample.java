package ex0213.과제.Exception;

class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
		
	}
}
class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		//id blue가 아니라면 NotExistIDException을 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIDException(id+" 아이디가 존재하지 않습니다.");
		}else {
			System.out.println(id+"는 존재하는 아이디입니다.");
		}
		if(!password.equals("12345")) {
			throw new WrongPasswordException(password+"패스워드가 틀립니다.");
		}
	}

}

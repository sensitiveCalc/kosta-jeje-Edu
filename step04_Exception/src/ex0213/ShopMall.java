package ex0213;

public class ShopMall {
	
	public void enter(int age) throws AgeException {

		if( age < 18) {
			//발생할 객체 생성
			//AgeException e = new AgeException();
			//throw e;
			throw new AgeException(age + "살은 가라");
			//throw new AgeException();
		}else {
			System.out.println(age+ "살 님 입장하신 걸 환영합니다. ");
		}
	}

}

package ex0211.Inheritance;
   
class CarCenter{
	
	// 재정의 하지 않고 사용. 매개변수를 이용한 다형성 -> 단, 접근 범위 제약이 있다. Car 타입 부분만 접근가능
	public void engineer(Car cd){
		System.out.println("cd 주소 = " + cd);
		//System.out.println("cd.i 주소 = " + cd.i); //부모타입은 자식타입 접근 불가
		
		// 자식 타입으로 접근 가능하도록 하는 법
		// = 부모타입을 자식타입으로 형변환(ObjectDownCasting)
		if(cd instanceof EfSonata) {
			System.out.println("========================");
			EfSonata efs = (EfSonata)cd; // ClassCastException예외 발생 가능하니 조건식에 넣는다
			System.out.println("efs 주소 = " + efs);
			System.out.println("efs.i = " + efs.i);
			System.out.println("========================");
		}
		
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc = new CarCenter();
		EfSonata ef = new EfSonata();
		Carnival ca = new Carnival();
		Excel ex = new Excel();
		
		Car c= new Car();
		
		//cc.engineer(c); // c 주소값이 전달
		System.out.println("ef 주소 = " + ef);
		System.out.println("ef.i = " + ef.i);
		cc.engineer(ef); // EfSonata Car 타입이 없다 -> 다형성 Car 타입에 상속받은 부모로 접근 가능
		cc.engineer(ca); //
		cc.engineer(ex); //
		
		
	
	}
}

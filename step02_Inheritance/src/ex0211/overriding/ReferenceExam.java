package ex0211.overriding;

class ObjectExam{ //생성자 오버로딩
	String str;
	public ObjectExam(){   }
	public ObjectExam(String str){
		this.str = str;
	} //재정의 된 메소드(=메소드 오버로딩)
	
	@Override // annotation: 현재 상태를 알려줌
	public String toString() {
		return str + " 주소값 = " + super.toString();
	}
}
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; //주소값이 저장됨
			String s02="Java"; //주소값이 저장됨
			String s03=new String("월요일"); //new String을 생략해도 객체 생성된다
			
			ObjectExam oe1=new ObjectExam("진짜 갈려고?");
			ObjectExam oe2=new ObjectExam("안녕");
			
			/**
			 * 	print(Object obj) or println(Object obj) 메소드는
			 *  인수로 전달된 객체.toString()을 호출한다 = toString()이 리턴하는 값을 출력하는 것
			 *  toString() = 현재 객체의 주소값을 문자열로 리턴하는 메소드
			 *  
			 *  Object에 정의된 toString은 객체의 주소(class이름@hashcode)를 문자열로 리턴
			 *  Object에 상속받은 String은 toString을 재정의 -> 자신의 문자열을 리턴
			 * */
			System.out.println(c);// a
			System.out.println(s01);// 장희정
			System.out.println(s02);// Java
			System.out.println(s03.toString());// 월요일
			
			System.out.println(oe1);// 주소값, 위와 값이 다른 이유는 재정의 된 메소드의 인자에 따라 달라진 것
			System.out.println(oe2);// 주소값, 현재 ObjectExam()는 부모인 Object의 주소를 가져온다
			
	}
}

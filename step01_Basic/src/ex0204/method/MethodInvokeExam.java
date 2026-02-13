package ex0204.method;

class Methodinvoke01{
	//다음과 같이 메소드를 작성하세요.
	
	/*method 이름 : method01
	어디서나 누구나 접근가능
	정수 리턴
	인수로 정수2개 받음
	인수로 들어온 정수 2개를 곱해서 출력하고 리턴*/
	
	public int method01(int i, int k) {
		int re01 = i*k;
		System.out.println(re01); //2
		
		return re01;
	}
}


class Methodinvoke02{
	
	//method 이름 : method02
	//어디서나 누구나 접근가능,객체를 생성하지 않고도 접근가능
	//정수 리턴
	//인수로 정수2개 받음
	
	//인수로 들어온 정수 2개를 더해서 출력하고 더한수 리턴
		public static int method02(int i, int k) {
			int re02 = i+k;
			System.out.println(re02); //7
			
			return re02;
		}
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01의 method01 호출
		Methodinvoke01 miv = new Methodinvoke01();
		int miv01Result = miv.method01(1, 2);
		System.out.println(miv01Result); //2
		
		//MethodInvoke02의 method02 호출
		int miv02Result = Methodinvoke02.method02(3, 5);
		
		System.out.println(miv02Result); //7
	}
}


package ex0212.final_abstract;

//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{ //상속 불가, 생성 가능
	final int i = -999999; //반드시 초기화, 값 변경 불가
}


abstract class AbstractClassExam{ //상속 가능, 생성 불가
    abstract String abstractMethodExam(int i,String s); //재정의를 위한 메소드로 body(구현부)가 없다
    final int finalMethodExam(int i, int j){ // 재정의 불가
        return i+j;
    }
}

/////////////////////////////////////////////////////////////
class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	/*
	int finalMethodExam(int i, int j){ //final은 상속이 불가능하다
		return i*j;
	}*/
	
}

class Sample02 /*extends FinalClassExam*/ {  } //final 클래스이므로 상속이 불가능하다

	abstract class Sample03 extends AbstractClassExam{
		//String abstractMethodExam(int i,String s){ //오버로딩은 인수가 다르게
		String abstractMethodExam(String s, int i){
			return s+i;
		 }
		abstract String abstractMethodExam(int i,String s);    
	
		void sampleMethod03(){
			System.out.println("void sampleMethod03() 호출 됨");
		}
	}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace /*= new AbstractClassExam()*/;  //abstract는 객체 생성불가
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000; //final 값변경 불가
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}

package ex0212.equals;

class EqualsExam2{
	String stringObject; // null
	
	public EqualsExam2(String s){
		stringObject = s; // null
	}
	
	@Override
	public boolean equals(Object obj) { //생성자로 만든 문자열을 equals메소드를 재정의하여 문자열값을 비교
		if(obj instanceof EqualsExam2) {
			EqualsExam2 e2 = (EqualsExam2)obj; //obj를 문자열 형태로 다운캐스팅
			return stringObject.equals(e2.stringObject);
		}
		return false;
	}
	public static void main(String args[]){		
		System.out.println("\nEqualsExam ee1 = new EqualsExam(\"Object.equals()\");" );
		System.out.println("\nEqualsExam ee2 = new EqualsExam(\"Object.equals()\");" );
				
		EqualsExam2 ee1 = new EqualsExam2("Object.equals()"); //String메소드가 아닌 object 형태로 비교하고 있어서
		EqualsExam2 ee2 = new EqualsExam2("Object.equals()"); //문자열이 아닌 주소를 비교하게 됨
		
		//ee1=자기자신, ee2=인수로 전달받는 값
		if(ee1.equals(ee2)){ //Object에 정의된 equals가 호출 - 주소값 비교
			System.out.println("1. ee1.equals(ee2) = true");
		}else{
			System.out.println("1. ee1.equals(ee2) = false"); //1. false 출력
		}
		
		if(ee1 == ee2){ //주소 비교
			System.out.println("2. (ee1 == ee2) = true");
		}else{
			System.out.println("2. (ee1 == ee2) = false"); // 2. false 출력
		}
		
		System.out.println("\nString s1 = \"new String Object1\";");
		System.out.println("\nString s2 = \"new String Object1\";");
		
		String s1 = "new String Object1"; //값이 같으면 같은 주소값을 가리킴
		String s2 = "new String Object1";
		
		if(s1.equals(s2)){ //문자열 비교
			System.out.println("3. s1.equals(s2) = true"); //3. true 출력
		}else{
			System.out.println("3. s1.equals(s2) = false");
		}
		
		if(s1==s2){ //주소 비교
			System.out.println("4. (s1==s2) = true"); // 4. trure 출력
		}else{
			System.out.println("4. (s1==s2) = false");
		}

		System.out.println("\nString s3 = new String(\"new String Object2\");");
		System.out.println("\nString s4 = new String(\"new String Object2\");");
 
 		String s3 = new String("new String Object2");
		String s4 = new String("new String Object2");

		if(s3.equals(s4)){ //문자열 비교
			System.out.println("5. s3.equals(s4) = true"); // 5. true 출력
		}else{
			System.out.println("5. s3.equals(s4) = false"); 
		}
		
		if(s3==s4){ //주소 비교
			System.out.println("6. (s3==s4) = true");
		}else{
			System.out.println("6. (s3==s4) = false"); // 6. false 출력
		}

		System.out.println("\nString s5 = new String(\"new String Object3\");");
		System.out.println("\nString s6 = \"new String Object3\";");
		System.out.println("\nString s7 = \"new String Object3\";");
 
 		String s5 = new String("new String Object3"); //문자열
		String s6 = "new String Object3";
		String s7 = "new String Object3";
		
		if(s5.equals(s6)){
			System.out.println("7. s5.equals(s6) = true"); // 7. true 출력
		}else{
			System.out.println("7. s5.equals(s6) = false");
		}
		
		if(s5==s6){
			System.out.println("8. (s5==s6) = true");
		}else{
			System.out.println("8. (s5==s6) = false"); // 8. false 출력
		}

		if(s6.equals(s7)){
			System.out.println("9. s6.equals(s7) = true"); // 9. true 출력
		}else{
			System.out.println("9. s6.equals(s7) = false"); 
		}
		
		if(s6==s7){
			System.out.println("10. (s6==s7) = true"); // 10. true 출력
		}else{
			System.out.println("10. (s6==s7) = false");
		}
	}
}

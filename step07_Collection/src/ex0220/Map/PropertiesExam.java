package ex0220.map;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExam {
	Properties pro = new Properties();
	public PropertiesExam() {
		// 직접 저장
		pro.setProperty("id" , "jang");
		pro.setProperty("age" , "10");
		pro.setProperty("addr" , "서울");
		
		// 모든 key 정보 가져오기
		for(String key : pro.stringPropertyNames()) {
			//저장된 정보 조회
			String value = pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
	} //test01 End

	/////////////////////////////////////////////////////////
	/**
	 * 외부의 ~.properties파일을 로딩하는 방법 2가지
	 * 1) IO를 이용한 방법
	 * 2) ResourceBundle을 이용한 방법
	 */
	
	// 1) IO를 이용한 방법
	public void test01() throws Exception {
		System.out.println("--------------------------------------");
		pro.clear(); //초기화
		//pro.load(new FileInputStream("src/ex0220/map/info.properties")); //inputstream을 읽어서 key와 value로 분리해서 결과를 불러옴
		
		//2. 클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
		// PropertiesExam.class 클래스가 있는 위치(폴더)가 기준이 된다.
		InputStream inputStream = PropertiesExam.class.getResourceAsStream("/ex0220/map/info.properties");
		pro.load(inputStream);
		
		 //3.클래스 위치한 패키지 내에서 파일 로딩할 때 - / 생략(상대경로)
		 //InputStream inpupStream = this.getClass().getResourceAsStream("info.properties"); 
		 //pro.load(inpupStream);
			  
		 //4.ClassLoader의 모든 경로에서 파일 읽음. 보통 resources 폴더의 파일 읽을 때 사용.
		 InputStream inpupStream = this.getClass().getClassLoader().getResourceAsStream("a.properties"); 
		 //this.getClass().getClassLoader().getResourceAsStream("ex0729/map/dbInfo.properties"); 
		 pro.load(inpupStream);
		 
		 //모든 key정보 가져오기
		 for(String key : pro.stringPropertyNames()) {
			 //저장된 정보 조회
			 String value = pro.getProperty(key);
			 System.out.println(key + " = " + value);
		 }
	}
	
	// 2) ResourceBundle을 이용한 방법
	public void test02() {
		System.out.println("----- test02( ) -----");
		// ResourceBundle는 ~.properties 파일을 로딩
		ResourceBundle rb = ResourceBundle.getBundle("a"); //classes 폴더를 기준으로 a.properties 로딩
		for(String key : rb.keySet()) {
			String value = rb.getString(key);
			System.out.println(key + " = " + value);
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		PropertiesExam pe = new PropertiesExam();
		pe.test01();
		System.out.println("------------------");
		pe.test02();
	}

}

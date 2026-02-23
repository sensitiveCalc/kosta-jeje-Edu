package ex0223.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutExam {
	public FileInputOutExam() {
		// byte단위로 파일 읽기(InputStream --> FileInputStream을 사용해야 함)
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/ex0223/test.txt"); //IO는 사용 후 닫기 기능 필수
			/*while(true) {
				int i = file.read(); //1byte씩 읽기
				if(i == -1) break;
				System.out.println(i + " = " + (char)i);
			}*/
			//////////////////byte 배열의 크기만큼 읽기 //////////////////////////
			int length = fis.available(); //읽을 수 있는 byte 수 변환
			System.out.println("length = " + length);
			
			byte b [] = new byte [length]; //5개(length)의 공간에 0으로 채워져 있는 상태. 크기가 정해져 있음(최대1024byte)
			//int re = file.read(b); //read가 읽어들이 byte 수
			int re = 0;
			while( (re = fis.read(b)) != -1 ) {
				System.out.println("re = " + re);
				System.out.println("b = " + b);
				System.out.println("------------2. ------------");
				
				// byte 배열을 -> String으로 변환
				String data = new String(b);
				System.out.println("data = " + data);
				System.out.println("------------3. ------------");
				
				//////////////////////////////////
				// 파일에 저장=출력
				//fos = new FileOutputStream("src/ex0223/write.txt"); //파일이 없으면 자동으로 생성하고 있으면 덮어쓰기한다
				fos = new FileOutputStream("src/ex0223/write.txt", true); //true = 붙여서 반복해서 횟수만큼 출력
				fos.write(65); //A
				fos.write(66); //B
				
				fos.write(13); //enter
				fos.write(10); //enter
				
				fos.write(75); //K
				
				//byte의 배열을 받는다
				String str = "배고프다 뭐 먹지?";
				
				//String --> byte배열로 변환
				fos.write(str.getBytes());
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 무조건 닫기 처리
			// null이 아닐 때 닫기 처리
			try {
				if( fis != null ) fis.close(); // 예외처리를 해야 한다.
				if( fos != null ) fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new FileInputOutExam();
	}

}

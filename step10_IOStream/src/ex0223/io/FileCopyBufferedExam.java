package ex0223.io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class FileCopyBufferedExam {
	
	public FileCopyBufferedExam(String readFile, String writeFile) {
		long start = System.nanoTime();
		//readFile에 있는 내용을 읽어서 writeFile에 저장한다.(Buffered 사용)
		//BufferedInputStream bis = null;
		//BufferedOutputStream bos = null;
		/*try {
			bis = new BufferedInputStream(new FileInputStream(readFile));
			bos = new BufferedOutputStream(new FileOutputStream(writeFile));
			*/
		
		// try ( ) 에 작성 시 finally를 작성할 필요가 없음
		try( BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readFile)); 
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeFile)); ) {
			
			int i = 0;
			while( (i = bis.read()) != -1 ) { //read로 읽은 bis가 -1이 아닐 때까지 읽는다
				bos.write(i); //저장(=쓰기)
			}
			bos.flush(); //버퍼를 비워라
			System.out.println("파일 복사 완료 입니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}/*finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}*/
		
		
		long end = System.nanoTime();
		
		System.out.println(end-start + "nano times");
	}
	
	
	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("읽을 파일명?");
		String writeFile = JOptionPane.showInputDialog("저장할 파일명?");
		
		new FileCopyExam(readFile, writeFile);
		
	}

}

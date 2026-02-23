package ex0223.io;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileExam {
    public FileExam() throws IOException{
    	String path = JOptionPane.showInputDialog("파일경로는?"); //swing = GUI
    	System.out.println(path);
    	File file = new File(path);
    	
    	if(file.exists()) { //파일이 존재한다면(폴더 or 파일)
    		System.out.println(path+"는 있습니다.^^");
    		
    		if(file.isDirectory()) { //디렉토리(폴더)인지 파일인지
    			System.out.println("폴더안에 정보를 확인 해볼게요!!");
    			String fileNames [] = file.list(); //파일과 디렉토리들의 정보를 문자열로 추출(단순 정보확인용)
    			//File fileNames [] = file.listFiles(); //파일이나 디렉토리의 정보를 조회할 때
    			for(String fname : fileNames) {
    				System.out.println(fname);
    			}
    		}else {
    			//파일인 경우
    			System.out.println("**파일의 정보를 확인해볼께요!!***");
    			System.out.println("file.canRead() = " + file.canRead());
    			System.out.println("file.canWrite() = " + file.canWrite());
    			System.out.println("file.length() = " + file.length());
    			System.out.println("file.getName() = " + file.getName());
    			System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
    			System.out.println("file.lastModified() = " + file.lastModified());
    		}
    	}else {
    		System.out.println(path+"가 없으니 생성할께요.");
    		//파일생성
    		file.createNewFile();
    		
    		//폴더 생성
    		file.mkdir();
    	}
    }
    
	public static void main(String[] args)throws IOException {
		new FileExam();
	}

}

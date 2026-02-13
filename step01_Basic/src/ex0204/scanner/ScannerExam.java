package ex0204.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// 키보드 입력, 스캐너 임포트: ctrl+shift+o
		Scanner sc = new Scanner(System.in);
		
		// 키보드입력은 숫자, 문자열, 공백있는 문자열
		//sc.next(); // next();= 공백없는 문자열만 인식(공백 및 개행 무시), nextLine();= 공백있는 문자열도 포함
		//int no = sc.nextInt();
		//System.out.println(no); //엔터를 입력해야 종료. 개행(\n)값까지 버퍼에 입력됨
		
		System.out.println("국어 ?: ");
		int kor = sc.nextInt();
		
		System.out.println("영어 ?: ");
		int eng = sc.nextInt();

		System.out.println("이름은 ?: ");
		String name = sc.nextLine();
		
		System.out.println(name +"님: " + kor + ", " + eng);
	}

}

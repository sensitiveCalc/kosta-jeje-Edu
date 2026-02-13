package ex0203.과제.ex01_연산자;

public class Exercise04 {

	public static void main(String[] args) {
		// 연필을 30명의 학생들에게 똑같이 나누어주기
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);

	}

}

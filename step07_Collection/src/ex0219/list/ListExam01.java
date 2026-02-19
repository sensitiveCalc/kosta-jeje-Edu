package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam01 extends ArrayList<Integer>{
	public ListExam01() {
		super(5); //int형 인수를 받는 부모 생성자
		
		//추가
		super.add(10);
		this.add(5);
		add(20);
		super.add(10);
		super.add(7);
		this.add(100);
		
		//list에 저장된 객체의 개수 출력
		System.out.println("저장된 개수 = " + super.size());
		
		//저장된 정보 출력하기
		for(int i = 0; i< super.size(); i++ ) {
			int no = super.get(i);
			System.out.println("no = " + no);
		}
		System.out.println("\n----개선된 for문----");
		
		//개선된 for문으로 작성하기
		for(int no : this ) { //this의 주소들을 가져옴
			System.out.println("no = " + no);
		}
		System.out.println();
		
		/////////////////////////////////////////
		//제거
		int i = this.remove(2); //3번째 인덱스 제거
		System.out.println("제거된 값 = " + i); //제거된 객체 값이 출력
		
		boolean b = this.remove((Object)20); //객체를 찾아서 제거
		System.out.println("b = " + b);

		
		System.out.println("\n----제거 후 개선된 for문----");
		for(int no : this ) { //this의 주소들을 가져옴
			System.out.println("no = " + no);
		}
		
		
		System.out.println("\n-----정렬하기-----");
		System.out.println("정렬 전 : " + this); //this.toString()
		Collections.sort(this); //오름차순 정렬(기본값)
		System.out.println("정렬 후 : " + this); //this.toString()
		
		//내림차순으로 정렬
		Collections.sort(this, Collections.reverseOrder());
		System.out.println("reverseOrder 정렬 후 : " + this);
		
		//생성으로 정렬
	}
	
	public static void main(String[] args) {
		new ListExam01();
	}
}

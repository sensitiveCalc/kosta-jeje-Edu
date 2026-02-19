package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam02 {
	//List<Integer> list = new ArrayList<>(5);
	//List<Integer> list = new Vector<Integer>();
	List<Integer> list = new LinkedList<Integer>(); //사이즈가 유연하게 늘어남
	//ArrayList<Integer> list = new ArrayList<Integer>(); //확장에 유연하지 못한 리턴 타입
	
	public ListExam02() {
		//추가
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(10);
		list.add(7);
		list.add(100);
		
		//list에 저장된 객체의 개수 출력
		System.out.println("저장된 개수 = " + list.size());
		
		//저장된 정보 출력하기
		for(int i = 0; i< list.size(); i++ ) {
			int no = list.get(i);
			System.out.println("no = " + no);
		}
		System.out.println("\n----개선된 for문----");
		
		//개선된 for문으로 작성하기
		for(int no : list ) { //this의 주소들을 가져옴
			System.out.println("no = " + no);
		}
		System.out.println();
		
		/////////////////////////////////////////
		//제거
		int i = list.remove(2); //3번째 인덱스 제거
		System.out.println("제거된 값 = " + i); //제거된 객체 값이 출력
		
		boolean b = list.remove((Object)20); //객체를 찾아서 제거
		System.out.println("b = " + b);

		
		System.out.println("\n----제거 후 개선된 for문----");
		for(int no : list ) { //this의 주소들을 가져옴
			System.out.println("no = " + no);
		}
		
		
		System.out.println("\n-----정렬하기-----");
		System.out.println("정렬 전 : " + list); //this.toString()
		//Collections.sort(this); //오름차순 정렬(기본값)
		System.out.println("정렬 후 : " + list); //this.toString()
		
		//내림차순으로 정렬
		//Collections.sort(this, Collections.reverseOrder());
		System.out.println("reverseOrder 정렬 후 : " + list);
		
		//생성으로 정렬
	}
	
	private int remove(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		new ListExam02();
	}
}

package ex0220.set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
	
	Set<Member> set = new HashSet<Member>(); // HashSet은 동등 객체를 중복 저장하지 않음 
	
	public MemberSetExam() {
		//회원 추가
		set.add(new Member("희정", 10, "서울"));
		set.add(new Member("소희", 20, "인천"));
		set.add(new Member("유정", 30, "경기"));
		set.add(new Member("희정", 30, "경기"));
		
		System.out.println("저장된 개수 = " + set.size());
	}
	public static void main(String[] args) {
		new MemberSetExam();
	}
}

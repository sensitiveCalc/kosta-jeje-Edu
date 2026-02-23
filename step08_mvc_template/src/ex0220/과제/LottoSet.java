package ex0220.과제;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 	과제명: TreeSet을 이용하여 로또번호 6개, 중복없이 내림차순으로 정렬하기
 *  작성자: 이진주
 *  작성일: 26.02.22
 */
public class LottoSet {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new TreeSet<>( (o1, o2) -> o2 - o1 );
		
		Random random = new Random();
		
		while(lotto.size() < 6) {
			int num = random.nextInt(45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}

}

package ex0220.과제;

import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class LottoSol extends TreeSet<Integer> {
	
	public LottoSol() {
		super(Collections.reverseOrder());
		
		Random r = new Random();
		while(super.size() < 6) {
			int num = r.nextInt(45) + 1;
			super.add(num);
		}
		System.out.println("로또번호: " + this);
	}
	
	public static void main(String[] args) {
		new LottoSol();
	}

}

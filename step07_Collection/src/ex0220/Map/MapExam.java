package ex0220.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExam {
	
	//Map<Integer, String> map = new HashMap<Integer, String>();
	Map<Integer, String> map = new TreeMap<Integer, String>();
	
	public MapExam() {
		//map에 추가, put( )메소드는 중복되는 키를 덮어씌운다.
		map.put(20, "진주");
		map.put(10, "민아");
		map.put(40, "유주");
		map.put(30, "지원");
		map.put(10, "한별");
		
		System.out.println("저장된 개수 = " + map.size());
		System.out.println("map = " + map.toString());
		
		// map에 들어있는 key, value 한 쌍을 엔트리라고 부른다.
		//모든 key의 정보를 가져와서 Set에 저장 = keySet( )
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator(); //iterator( ) = 반복, key를 꺼낼 준비
		while(it.hasNext()) { //요소가 있다면(꺼낼 게 있다면)
			int key = it.next(); //요소를 꺼낸다.
			String value = map.get(key); //꺼낸 key에 해당하는 value 조회
			System.out.println(key+"과 " + value);
		}
		
		System.out.println("\n-------- 개선된 for문 사용 ---------");
		for(Integer key : keySet ) { //integer타입 key 선언
			String value = map.get(key);
			System.out.println(key+ "과 " + value);
		}
		System.out.println("\n-------- Entry 형태로 조회하기 ---------");
		Set<Entry<Integer, String>> set = map.entrySet();
		for(Entry<Integer, String> e : set) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		System.out.println("\n-------- 삭제 ---------");
		map.remove(30);
		System.out.println("삭제 후 = " + map);
	}
	
	public static void main(String[] args) {
		new MapExam();
	}
}

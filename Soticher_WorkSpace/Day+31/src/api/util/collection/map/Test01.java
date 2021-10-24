package api.util.collection.map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {

		// Map<K,V> 2개의 데이터가 set으로 구성되어 저장되는 저장소
		// -> HashMap<K,V>

		// 흔히 볼 수 있는 Map형태의 저장소
		// [아이디, 비밀번호] - 아이디 중복 불가, 비밀번호 중복 가능, 아이디 -> 비밀번호
		// [변수] Key value	 Memory
		// int a = 10; 		[a = 10]
		// int b = 10; 		[b = 10]
		// int a = 20; (x) a=20; -> 값을 바꾸는 것이고 a라는 변수의 이름이 바뀌는 것이 x
		// K(key) : 중복이 불가능한 형태, Set<E>와 같은 형태 **
		// V(value : 중복이 가능한 형태 **
		// [목적] 전체 추출보다는 특정 요소에 접근하는 것을 극대화 시킨 저장소

		// Map - Key와 Value값을 한 쌍으로 데이터들을 관리하는 컬렉션
		//	   - Key값을 통하여 Value값을 관리한다
		// 	   - 순서는 유지되지 않는다 **
		// 	   - 웹에서는 기본적으로 데이터 이동시 사용되는 것이 map이다

		// Key value
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 데이터 추가 .put(key, value)
		map.put("Black", 1);
		map.put("White", 2);
		map.put("Gray", 3);
		map.put("Blue", 4);
		map.put("Red", 5);
		map.put("Grean", 6);
		
		System.out.println(map.put("Black", 2));
		System.out.println(map.put("Black", 3));
		
		System.out.println("===========================");
		
		//데이터 수정 - .replace(K,V)
		System.out.println(map.replace("black", 2));
		System.out.println(map.replace("Black", 2));
		
		System.out.println("===========================");
		
		//containsKey(K)	containsValue(V)	- 데이터 유무를 확인하는 메소드
		System.out.println(map.containsKey("Black"));
		System.out.println(map.containsKey("Pink"));
		System.out.println(map.containsValue(100));
		System.out.println(map.containsValue(2));
		
		System.out.println("===========================");
		
		//.clear() - map안의 데이터들을 모두 비우는 역할
		//map.clear();
		
		//.size() - map개수
		System.out.println(map.size());
		
		System.out.println("===========================");
		
		//.get(Key) - 데이터 추출
		System.out.println(map.get("black"));
		System.out.println(map.get("Black"));
		
		System.out.println("===========================");
		
		//.entrySet() // Key, value 모두
		System.out.println(map.entrySet());
		
		
		//.KeySet() //key 만
		System.out.println(map.keySet());
		Set<String> set = map.keySet(); //Key값은 중복이 x
		Iterator<String> it = set.iterator();
		
		//map은 value의 값을 불러오는 메소드는 있지만 key값을 불러올 방법이 없기 때문에 set을 이용하여 key값을 출력해야함
		
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println("Key : "+key+"\tValue : "+value);
		}
		
		for(String key : set) {
			Integer value = map.get(key);
			System.out.println(value);
		}
		
	}

}

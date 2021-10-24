package api.util.collection.map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {

		// Map<K,V> 2���� �����Ͱ� set���� �����Ǿ� ����Ǵ� �����
		// -> HashMap<K,V>

		// ���� �� �� �ִ� Map������ �����
		// [���̵�, ��й�ȣ] - ���̵� �ߺ� �Ұ�, ��й�ȣ �ߺ� ����, ���̵� -> ��й�ȣ
		// [����] Key value	 Memory
		// int a = 10; 		[a = 10]
		// int b = 10; 		[b = 10]
		// int a = 20; (x) a=20; -> ���� �ٲٴ� ���̰� a��� ������ �̸��� �ٲ�� ���� x
		// K(key) : �ߺ��� �Ұ����� ����, Set<E>�� ���� ���� **
		// V(value : �ߺ��� ������ ���� **
		// [����] ��ü ���⺸�ٴ� Ư�� ��ҿ� �����ϴ� ���� �ش�ȭ ��Ų �����

		// Map - Key�� Value���� �� ������ �����͵��� �����ϴ� �÷���
		//	   - Key���� ���Ͽ� Value���� �����Ѵ�
		// 	   - ������ �������� �ʴ´� **
		// 	   - �������� �⺻������ ������ �̵��� ���Ǵ� ���� map�̴�

		// Key value
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ������ �߰� .put(key, value)
		map.put("Black", 1);
		map.put("White", 2);
		map.put("Gray", 3);
		map.put("Blue", 4);
		map.put("Red", 5);
		map.put("Grean", 6);
		
		System.out.println(map.put("Black", 2));
		System.out.println(map.put("Black", 3));
		
		System.out.println("===========================");
		
		//������ ���� - .replace(K,V)
		System.out.println(map.replace("black", 2));
		System.out.println(map.replace("Black", 2));
		
		System.out.println("===========================");
		
		//containsKey(K)	containsValue(V)	- ������ ������ Ȯ���ϴ� �޼ҵ�
		System.out.println(map.containsKey("Black"));
		System.out.println(map.containsKey("Pink"));
		System.out.println(map.containsValue(100));
		System.out.println(map.containsValue(2));
		
		System.out.println("===========================");
		
		//.clear() - map���� �����͵��� ��� ���� ����
		//map.clear();
		
		//.size() - map����
		System.out.println(map.size());
		
		System.out.println("===========================");
		
		//.get(Key) - ������ ����
		System.out.println(map.get("black"));
		System.out.println(map.get("Black"));
		
		System.out.println("===========================");
		
		//.entrySet() // Key, value ���
		System.out.println(map.entrySet());
		
		
		//.KeySet() //key ��
		System.out.println(map.keySet());
		Set<String> set = map.keySet(); //Key���� �ߺ��� x
		Iterator<String> it = set.iterator();
		
		//map�� value�� ���� �ҷ����� �޼ҵ�� ������ key���� �ҷ��� ����� ���� ������ set�� �̿��Ͽ� key���� ����ؾ���
		
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

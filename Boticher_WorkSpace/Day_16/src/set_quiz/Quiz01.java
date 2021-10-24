package set_quiz;

import java.util.HashSet;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		// Q. 1234, 3456 �� ������, ������, �������� ���ϼ���.

		// 1234, 3456 ���� �����Ѵ�.
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		// �Ʒ� ��ü�� ����� �����Ѵ�.(���� ������ set1�� �� ������ ���� �ʰ� �ϱ� ����)
		Set<Integer> union = new HashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		
		Set<Integer> difference = new HashSet<>();
		difference.addAll(set1);
		difference.removeAll(set2);
		
		Set<Integer> intersection = new HashSet<>();
		intersection.addAll(set1);
		intersection.retainAll(set2);
		
		// TODO: �����ϱ�
		System.out.println("������ : " + union);
		System.out.println("������ : " + difference);
		System.out.println("������ : " + intersection);
		
		
	}

}

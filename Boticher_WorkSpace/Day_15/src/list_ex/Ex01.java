package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		// �迭 (Array)
		// 1. ũ�⸦ �̸� �˰� �־�� �Ѵ� / ũ�Ⱑ �����Ǿ� �ִ�
		// 2. �߰��� �ִ� ���� ������ ����ִ� ä�� �����ȴ�
		// 3. index������� �����Ѵ�
		// 4. �⺻ �ڷ���, Ŭ���� �ڷ����� ���� �� �ִ�
		
		// ����Ʈ (List)
		// 1. ũ�Ⱑ �����Ǿ� ���� �ʰ�, �������� �Ҵ�ȴ�
		// 2. �߰��� �ִ� ���� ������ ������ ������� (�޸� ���� ����)
		// 3. ���� ������� �����͸� �ٷ� �� �ִ�
		// 4. Ŭ���� �ڷ����� ���� �� �ִ�
		// 5. Ÿ�� �������� �����ϴ� Generic ������ �� �� �ִ�
		
		// List Interface�� ���� ����ü�� ArrayList ���
		// ó�� ������� �� 10���� ��������� ���߿� �� �߰��Ǹ� �� ������ �ݸ�ŭ �� �þ�ٰܴ� ��
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println("list1 : " + list1);
		System.out.println("list1 toSting() : " + list1.toString());
		
		// List Interface�� ���� ����ü�� LinkedList ���
		List<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.addAll(list1);
		System.out.println("list2 : " + list2);
		
		// ��� �����ϱ�
		// ù �� ° ����� 10 -> 200���� ����
		System.out.println(list2.set(0, 200)); // ������ �ִ� ���� ��������
		System.out.println(list2.get(0));
		
		// ��� �����ϱ�
		Integer deletedValue = list2.remove(1); // index 1 ��ġ�� ��� �� ����
		System.out.println(deletedValue);
		System.out.println("list2 : " + list2);
		Integer dValue = 200;
		list2.remove(dValue);
		System.out.println("list2 : " + list2);
		
		// �� ������ Ư¡
		int a = 0; // null �ȵ�
		Integer b = null; // ��� ��
		
		List<String> strList1 = new ArrayList<>();
		
		strList1.add("fuck");
		strList1.add("you");
		System.out.println(strList1.remove("fuck"));
		System.out.println("strList1 : " + strList1);
		
		// ��� ��� �����ϱ�
		strList1.clear();
		System.out.println("strList1 : " + strList1);
		
	}

}

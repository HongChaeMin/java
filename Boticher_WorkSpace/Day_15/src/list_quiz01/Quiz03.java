package list_quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));

		list.sort(null);

		double avg = 0.0;

		for (int i = 1; i < list.size() - 1; i++) {
			avg += list.get(i);
		}

		avg /= list.size() - 2;

		System.out.println("�ְ����� �������� ������ ��� ������ " + avg);

		ArrayList<String> member1 = new ArrayList<>(Arrays.asList("���", "����", "���", "����", "�κ�"));

		ArrayList<String> member2 = new ArrayList<>(Arrays.asList("ä��", "����", "����", "�κ�", "����"));

		
		// ���ڵ�
		int count = 1;
		for(int i=0; i< member2.size(); i++) {
			if (member1.contains(member2.get(i))) { // �������� �ִ� ���
				String name = member2.get(i) + count; // ���ڰ� ���� �̸�
				if (member1.contains(name)) { // ���ڰ� ���� �̸��� ������������ Ȯ��
					i--; // �̸� + ��ȣ �̸����� �ٽ� �� �� �˻��ϱ� ���� ���� �̸����� �ݺ����� �ٽ� ������
					count++;
					continue;
				}
				member1.add(name);
				count = 1;
			} else {
				member1.add(member2.get(i));
			}
		}

		System.out.println(member1);
		
//		for (int i = 0; i < member1.size(); i++) {
//			int num = 1;
//			for (int j = 0; j < member2.size(); j++) {
//				if (member1.get(i).equals(member2.get(j))) {
//					member2.set(j, member2.get(j) + num);
//					num++;
//				}
//			}
//		}
//
//		member1.addAll(member2);
//
//		System.out.println(member1.toString());

	}

}

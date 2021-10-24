package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz03 {

	// final keyword : ����, �� �� �� �ʱ�ȭ �ǵ��� �ϴ� ��
	// 1. ���� : ������ ���̸� �� �� �ʱ�ȭ �� ������ ���� ���Ҵ� �Ұ�
	// 2. �޼ҵ� : �޼ҵ忡 ���̸� �������̵� �Ұ�
	// 3. Ŭ���� : ��� �Ұ�
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
		{
			put("���ѹα�", "����");
			put("����ũ", "�����ϰ�");
			put("����", "������");
			put("���þ�", "��ũ��");
			put("���⿡", "���");
			put("�����", "���������");
			put("������", "����Ȧ��");
			put("������", "����");
			put("������", "���帮��");
			put("�Ƹ���Ƽ��", "�ο��뽺���̷���");
			put("����Ʈ", "ī�̷�");
			put("�̶�", "�����");
			put("��Ż����", "�θ�");
			put("�Ϻ�", "����");
			put("�ʸ���", "���Ҷ�");
			put("�ɶ���", "���Ű");
			put("������", "�ĸ�");
			put("��Ű", "��ī��");
			put("ĳ����", "��Ÿ��");
			put("�ݷҺ��", "����Ÿ");
		}
	};

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Set<String> keys = capitalMap.keySet();
		List<String> keyList = new ArrayList<>(keys); // �����̸� List�� index�� ���� �� ��
		List<String> check = new ArrayList<>();

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int random = (int) (Math.random() * 20) + 0;
			if (check.contains(keyList.get(random))) {
				i--;
				continue;
			}
			
			System.out.print(keyList.get(random) + " ���� �̸��� ? : ");
			String userAnswer = scan.next();
			if (capitalMap.get(keyList.get(random)).equals(userAnswer)) {
				System.out.println("����");
				check.add(keyList.get(random));
				sum += 100 / 5;
			} else {
				System.out.println("������");
			}
		}
		System.out.println("�� ������ " + sum + "��");

	}

}
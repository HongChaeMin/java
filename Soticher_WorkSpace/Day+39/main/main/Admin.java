package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import admin.AdminMain;

public class Admin {

	Scanner sc = new Scanner(System.in);

	Map<String, String> adminId = new HashMap<>();

	boolean check = true;

	public Admin() {

		check = true;
		while (check) {
			System.out.println("1. �α��� �ϱ�\t2. ȸ������ �ϱ�\t3. ���ư���");
			int n = sc.nextInt();
			if (n == 1) {
				boolean on = true;
				System.out.print("adminId : ");
				String id = sc.next();
				System.out.print("adminPw : ");
				String pw = sc.next();
				Set<String> set = adminId.keySet();
				for (String key : set) {
					String value = adminId.get(key);
					if (id.equals(key) && pw.equals(value)) {
						System.out.println("�α��� ����");
						on = false;
						try {
							AdminMain admin = new AdminMain();
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					}
				}
				if (on) {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�");
				}
			} else if (n == 2) {
				String idRegex = "^[a-zA-Z0-9]{1,12}$";
				System.out.print("ID / ����, ���� ���� 1 ~ 12�� �̳��� �Է����ּ��� : ");
				String id = sc.next();
				if (adminId.containsKey(id)) {
					System.out.println("�ߺ��� ���̵� �Դϴ�");
					continue;
				} else if (Pattern.matches(idRegex, id)) {
					System.out.print("��й�ȣ�� �Է����ּ��� : ");
					String pw = sc.next();
					adminId.put(id, pw);
					System.out.println("���̵� ��ϵǾ����ϴ�");
				} else {
					System.out.println("���̵� �߸� �Է��ϼ̽��ϴ�");
				}
			} else {
				System.out.println("�ý����� �����մϴ�");
				check = false;
			}
		}
	}

}

import student.file.*;
import student.*;

import java.util.*;

public class Main {

	private static final Comparator<? super Student> Student = null;

	public static void main(String[] args) throws Exception {

		// ���� �����ϴµ� �������� �޾Ƽ�
		// ���Ͽ� �����ϰ�
		// �ٽ� �����ϴ��� �� �������� �޾ƿͼ� ����� �� �� �ְ�

		Student st1 = new Student("�����", 12, 78, 78);
		Student st2 = new Student("������", 99, 16, 56);
		Student st3 = new Student("������", 99, 16, 56);
		Student st4 = new Student("������", 34, 65, 10);

		List<Student> list = new ArrayList<>();

		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);

		FileIo file = new FileIo();

		file.fileOutput(list);

		list = file.fileInput();

//		for (int i = 0; i < list.size(); i++) {
//			list.get(i).disp();
//		}

		//List<String> rank = file.rangking(list);

//		int j = 0;
//
//		for (int i = 0; i < rank.size(); i++) {
//			System.out.println((++j) + "�� : " + rank.get(i));
//		}

	}

}

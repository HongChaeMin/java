package api.util.list;

import java.util.*;

public class TotalStudent {

	//����Ʈ ����
	private ArrayList<Student> list = new ArrayList<>();
	
	//��ü ��Ż ����
	//����Ʈ�� �ִ� Student��ü ���� ������ ��Ż���� ����
	private int art, ait, mat, tot;
	private double avgt;
	
	//������
	public TotalStudent(ArrayList<Student> list) {
		if(list == null) {
			System.out.println("�߰� �� �� �����ϴ�");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			addStudent(list.get(i));
		}
		totalSet();
	}
	//����Ʈ �ļ���
	public TotalStudent() {}
	
	//�߰�
	public void addStudent(String name, int ar, int ai, int ma) {
		list.add(new Student(name, ar, ai, ma));
		totalSet();
	}
	public void addStudent(Student s) {
		if(s == null) {
			System.out.println("�߰� �� �� �����ϴ�");
			return;
		}
		list.add(s);
		totalSet();
	}
	
	// setter
	public void totalSet() {
		// ��� �������� ���ϰ� �ʱ�ȭ ������
		art = 0;
		ait = 0;
		mat = 0;
		tot = 0;
		avgt = 0;
		// ����Ʈ�� ����Ǿ� �ִ� ��� �л��� ���� ������ ��� ���
		for(int i=0; i<list.size(); i++) {
			art += list.get(i).getAr(); // Student�� �ִ� �˰��� ������
			ait += list.get(i).getAi(); // 		"	      �ΰ����� ������
			mat += list.get(i).getMa(); // 		"	      �̻���� ������
		}
		this.tot = art + ait + mat;
		this.avgt = tot/list.size()/3.0; // �Ѱ� + ����� + �����
	}
	
	// getter
	public int getArt() {
		return art;
	}
	public int getAit() {
		return ait;
	}
	public int getMat() {
		return mat;
	}
	public int getTot() {
		return tot;
	}
	public double getAvgt() {
		return avgt;
	}
	// list �ȿ� �ִ� Student ��ü�� ��ȯ
	public Student getStudent(int i) {
		return list.get(i);
	}
	
	public void totalDisp() {
		System.out.println("�̸�\t�˰���\t�ΰ�����\t�̻����\t����\t���");
		System.out.println("-----------------------------------------");
		for(int i=0; i<list.size(); i++) {
			list.get(i).showData(); // list�ȿ� �ִ� Student��ü�� ��� �޼ҵ�
		}
		System.out.println("=========================================");
		System.out.println("�Ѱ�\t"+getArt()+"\t"+getAit()+"\t"+getMat()+"\t"+getTot()+"\t"+getAvgt());
	}
	
}

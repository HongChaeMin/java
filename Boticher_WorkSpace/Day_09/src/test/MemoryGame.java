package test;

public class MemoryGame {

	private String[] fruits = { "���", "���", "�ٳ���", "�ٳ���", "����", "����" };

	public void shuffle() {
		for (int i = 0; i < 50; i++) {
			int num = (int) (Math.random() * 6) + 0;
			String fruit = fruits[0];
			fruits[0] = fruits[num];
			fruits[num] = fruit;
		}
	}

	public boolean getFlag() {
		int check = 0;
		for (int i = 0; i < fruits.length; i++) {
			if (!fruits[i].equals("")) {
				check++;
			}
		}

		if (check == 0) {
			return true;
		}
		return false;
	}

	public void flip(int index1, int index2) {
		if (fruits[index1].equals(fruits[index2]) || (!fruits[index1].equals("") && !fruits[index2].equals(""))) {
			System.out.println("��� ���߼̾��!!");
			fruits[index1] = "";
			fruits[index2] = "";
		} else {
			System.out.println("�������פ��о־־־�");
		}
	}

}

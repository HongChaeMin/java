package api.util.collection.list;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Player p1 = new Player("����");
		Player p2 = new Player("������");
		Player p3 = new Player("���γ�");

		List<Player> pl = new ArrayList<>();

		pl.add(new Player("����"));
		pl.add(new Player("������"));
		pl.add(new Player("���γ�"));

		pl.get(0).setLv(20);
		pl.get(1).setLv(15);
		pl.get(2).setLv(30);

		pl.get(0).disp();
		pl.get(1).disp();
		pl.get(2).disp();

	}

}

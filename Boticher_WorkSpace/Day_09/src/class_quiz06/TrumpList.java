package class_quiz06;

public class TrumpList {

	Trump[][] trumpList = new Trump[4][13];
	
	public TrumpList() {
		for (int i = 0; i < trumpList.length; i++) {
			for (int j = 0; j < trumpList[i].length; j++) {
				trumpList[i][j] = new Trump();
				trumpList[i][j].setPattern(i + 1);
				trumpList[i][j].setNumber(j + 1);
			}
		}
	}
	
	public void trumpMix() {
		for (int i = 0; i < 1000; i++) {
			int random1 = (int) (Math.random() * 4) + 0;
			int random2 = (int) (Math.random() * 13) + 0;

			Trump n = trumpList[0][0];
			trumpList[0][0] = trumpList[random1][random2];
			trumpList[random1][random2] = n;

		}
	}
	
	public void disp() {
		for (int i = 0; i < trumpList.length; i++) {
			for (int j = 0; j < trumpList[i].length; j++) {
				System.out.print(trumpList[i][j].trump() + " ");
			}
			System.out.println();
		}
	}
	
}

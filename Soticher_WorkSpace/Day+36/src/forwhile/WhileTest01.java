package forwhile;

import java.util.*;

public class WhileTest01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int map[][] = new int[20][20];

		int desX = (int) (Math.random() * 20) + 0;
		int desY = (int) (Math.random() * 20) + 0;
		int speed = 0;
		int dir = 0;
		int money = 0;
		int x = 0, y = 0;
		int c = 0;
		boolean check = true;

		map[x][y] = 5;
		map[desX][desY] = 100;

		System.out.println("★  = 도착 지점        ● = 현재 위치");
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 100) {
					System.out.print("★");
				} else if (map[i][j] == 5) {
					System.out.print("●");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

		while (check) {
			System.out.println("원하는 메뉴를 선택해주세요");
			System.out.println("1.속도설정\t2.방향설정\t3.이동하기");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("원하는 속도를 입력해주세요(1~3) : ");
				speed = sc.nextInt();
				break;
			case 2:
				System.out.println("1.동  2.서  3.남  4.북");
				System.out.print("원하는 방향을 입력해주세요 : ");
				dir = sc.nextInt();
				break;
			case 3:
				if(x == desX && y == desY) {
					System.out.println("도착 하셨습니다 !! 총 요금 : "+(money*50)+"원 입니다");
					check = false;
				}else {
					System.out.println("이동합니다");
					for (int i = 0; i < 20; i++) {
						for (int j = 0; j < 20; j++) {
							if (dir == 1) {
								x += speed; y = j;
								map[x][y] = 5;
								map[i][j] = 0;
								money += speed;
								c++;
								break;
							}else if(dir == 2) {
								x -= speed; y = j;
								map[x][y] = 5;
								map[i][j] = 0;
								money += speed;
								c++;
								break;
							}else if(dir == 3) {
								x = i; y += speed;
								map[x][y] = 5;
								map[i][j] = 0;
								money += speed;
								c++;
								break;
							}else if(dir == 4) {
								x = i; y -= speed;
								map[x][y] = 5;
								map[i][j] = 0;
								money += speed;
								c++;
								break;
							}
						}
						if(c == 1) {
							c = 0;
							break;
						}
					}
					System.out.println("★  = 도착 지점        ● = 현재 위치");
					for (int i = 0; i < 20; i++) {
						for (int j = 0; j < 20; j++) {
							if (map[i][j] == 100) {
								System.out.print("★");
							} else if (map[i][j] == 5) {
								System.out.print("●");
							} else {
								System.out.print("0");
							}
						}
						System.out.println();
					}
				}
				break;
			}

		}

	}

}

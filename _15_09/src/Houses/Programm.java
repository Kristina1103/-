package Houses;

import java.util.*;

public class Programm {
	public static void main(String[] args) {
		new Programm();
	}

	Programm() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("—колько квартир? ");
		int n = sc.nextInt();
		int sz[][] = new int[n][6];
		for (int i = 0; i < sz.length; i++) {
			for (int j = 0; j < 4; j++)
				sz[i][j] = rnd.nextInt(6) + 3;
			int type = rnd.nextInt(2) + 1;
			if (type == 2) {
				sz[i][4] = rnd.nextInt(6) + 3;
				sz[i][5] = rnd.nextInt(6) + 3;
			}
		}
		Houses house = new Houses(sz);
		System.out.println(house);
		System.out.println("—редн€€ площадь 1-й кв: " + house.average1());
		System.out.println("—редн€€ площадь 2-й кв: " + house.average2());
		System.out.println("Ќаибольша€ площадь 1-й кв: " + house.max1());
		System.out.println("Ќаибольша€ площадь 2-й кв: " + house.max2());
		System.out.println("—редн€€ площадь спален: " + house.averageBedroom());
	}

}

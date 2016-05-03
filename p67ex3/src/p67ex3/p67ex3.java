package p67ex3;

public class p67ex3 {
	public static void main(String[] args) {
		int mass[][] = new int[7][4];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 11 - 5);
			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println("");
		}
		int m = 0;
		int max = 1;
		int p = 1;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				p = p * mass[i][j];

			}
			if (Math.abs(p) > max) {
				max = Math.abs(p);
				m = i;

			}
			p = 1;
		}
		System.out.println("");

		System.out.print(m);

	}

}

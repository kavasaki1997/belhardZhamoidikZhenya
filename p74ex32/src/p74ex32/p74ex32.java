package p74ex32;

public class p74ex32 {

	public static void main(String[] args) {
		int mass[][] = new int[6][7];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10 + 0);
			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println("");
		}
		for (int i = 0; i < mass.length; i++) {
			int k = 0;
			int max = 0;
			int m = 0;
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] > max) {
					max = mass[i][j];
					m = j;
				}
			}
			k = mass[i][0];
			mass[i][0] = mass[i][m];
			mass[i][m] = k;
		}
		System.out.println("");
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println("");
		}

	}
}

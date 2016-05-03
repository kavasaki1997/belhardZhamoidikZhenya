package p75ex39;

public class p75ex39 {

	public static void main(String[] args) {
		int n = 6;
		int t = 6;
		int k = 3;
		int mass[][] = new int[n][t];
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 21 - 10);
			}
		}
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println("");
		}
		int max = mass[0][0];
		int nom1 = 0;
		int nom2 = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (Math.abs(mass[i][j]) > max) {
					max = Math.abs(mass[i][j]);
					nom1 = i;
					nom2 = j;
				}
			}
		}
		int s = 0;
		for (int i = 0; i < mass.length; i++) {
			s = mass[i][k];
			mass[i][k] = mass[i][nom2];
			mass[i][nom2] = s;

		}
		int m = 0;
		for (int i = 0; i < mass.length; i++) {
			m = mass[k][i];
			mass[k][i] = mass[nom1][i];
			mass[nom1][i] = m;

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

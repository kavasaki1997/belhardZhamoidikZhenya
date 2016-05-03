package p74ex36;

public class p74ex36 {

	public static void main(String[] args) {
		int nom = 2;
		int k = 0;
		int N = 3;
		int mass[][] = new int[N][N];
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
		int max = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i][i] > max) {
				max = mass[i][i];
				nom = i;
			}
		}
		int mas[];
		for (int i = 0; i < mass.length; i++) {
			mas = mass[k];
			mass[k] = mass[nom];
			mass[nom] = mas;

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

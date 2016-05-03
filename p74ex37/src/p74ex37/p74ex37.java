package p74ex37;

public class p74ex37 {

	public static void main(String[] args) {
		int nom = 0;
		int M = 6;
		int N = 6;
		int mass[][] = new int[N][M];
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
		int m = 0;
		for (int i = 0; i < mass.length; i++) {
			int min = mass[i].length;

			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] < min) {
					min = mass[i][j];
					nom = j;
				}
			}
			m = mass[i][nom];
			mass[i][nom] = mass[i][mass[i].length - 1];
			mass[i][mass[i].length - 1] = m;
		}
		for (int i = 0; i < mass.length; i++) {
			int max = 0;
			for (int j = 0; j < mass[i].length; j++) {

				if (mass[i][j] > max) {
					max = mass[i][j];
					nom = j;
				}
			}
			m = mass[i][nom];
			mass[i][nom] = mass[i][0];
			mass[i][0] = m;
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

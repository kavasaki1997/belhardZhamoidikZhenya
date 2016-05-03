package p74ex34;

public class p74ex34 {

	public static void main(String[] args) {
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
		int sum = 0;
		int kol = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int j = i + 1; j < mass[i].length; j++) {
				if (mass[i][j] > 0) {
					sum += mass[i][j];
					kol++;
				}
			}
		}
		System.out.print(sum);
		System.out.println();
		System.out.print(kol);
	}

}

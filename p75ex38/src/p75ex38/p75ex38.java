package p75ex38;

public class p75ex38 {

	public static void main(String[] args) {
		int N = 6;
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
		int m = 0;
		for (int i = 0; i < mass.length - 1; i++) {
			int sum = 0;
			int sum1 = 0;
			for (int j = 0; j < mass[i].length; j++) {
				sum += mass[i][j];
				sum1 += mass[i + 1][j];

			}

			if (sum == sum1) {
				m = sum;
				continue;
			} else {
				System.out.println("false");
				break;
			}
		}
		int k = 0;
		for (int i = 0; i < mass.length; i++) {

			int sum1 = 0;
			for (int j = 0; j < mass[i].length; j++) {
				sum1 += mass[j][i];
			}
			if (m == sum1) {
				k = sum1;
				continue;

			} else {
				k = sum1;
				System.out.println("false");
				break;
			}
		}
		if (k == m) {
			System.out.println("true");
		}

	}
}
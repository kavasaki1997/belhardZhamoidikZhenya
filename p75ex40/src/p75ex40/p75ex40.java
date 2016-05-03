package p75ex40;

public class p75ex40 {

	public static void main(String[] args) {
		int N = 6;
		int mass[][] = new int[N][N];
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
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] < 0) {
					mass[i][j] = 0;
				} else {
					mass[i][j] = 1;
				}
			}
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

package p67ex2;

public class p67ex2 {

	public static void main(String[] args) {
		int mass[][] = new int[5][8];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 199 - 99);
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
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] > max) {
					max = mass[i][j];
				}
			}

		}
		System.out.println(max);
	}

}

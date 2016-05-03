package p69ex1;

public class p69ex1 {
	public static void main(String[] args) {
		int mass[][] = new int[4][];
		mass[0] = new int[(int) (Math.random() * 10 + 1)];
		mass[1] = new int[(int) (Math.random() * 10 + 1)];
		mass[2] = new int[(int) (Math.random() * 10 + 1)];
		mass[3] = new int[(int) (Math.random() * 10 + 1)];

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
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {

				int mas[];

				if (mass[i].length < mass[j].length) {

					mas = mass[i];
					mass[i] = mass[j];
					mass[j] = mas;

				}

			}

		}
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
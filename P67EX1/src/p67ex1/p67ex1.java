package p67ex1;

public class p67ex1 {

	public static void main(String[] args) {
		int mass[][] = new int[8][5];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[j].length; j++) {
				mass[i][j] = (int) (Math.random() * 90 + 10);
			}
		}
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println("");
		}

	}

}

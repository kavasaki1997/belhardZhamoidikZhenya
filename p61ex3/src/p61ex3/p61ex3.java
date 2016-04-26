package p61ex3;

public class p61ex3 {

	public static void main(String[] args) {
		int mass[] = new int[15];

		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 10 + 0);
		}
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		int kol = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				kol++;
			}
		}
		System.out.println("");
		System.out.print(kol);
	}

}

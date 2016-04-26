package p61ex2;

public class p61ex2 {
	public static void main(String[] args) {
		int mass[] = new int[50];
		int n = 1;
		for (int i = 0; i < mass.length; i++) {
			if (n > 99) {
				break;
			}
			mass[i] = n;
			n += 2;
		}
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println("    ");
		int k = mass.length;
		for (int j = k - 1; j > 0; j--) {
			System.out.print(mass[j] + " ");
		}
	}
}

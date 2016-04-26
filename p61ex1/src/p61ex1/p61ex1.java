package p61ex1;

public class p61ex1 {
	public static void main(String[] args) {
		int mass[] = new int[10];
		int n = 2;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = n;
			n += 2;
		}
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
			System.out.println("");
		}
	}
}

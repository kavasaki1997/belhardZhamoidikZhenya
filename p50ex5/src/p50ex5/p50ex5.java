package p50ex5;

public class p50ex5 {

	public static void main(String[] args) {
		int p, q;
		System.out.println("2" + "3" + "5" + "7");

		for (int i = 10; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
	}

}

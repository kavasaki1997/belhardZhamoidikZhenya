import java.util.Scanner;

public class Test {
	public int a;

	public void Test() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("¬ведите число");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		a = k;
	}

	public void delenie(int a) {
		int b = 0;

		try {
			for (int i = -5; i < 6; i++) {
				if (i == 0) {
					b = i;
					throw new MyError("sd");

				} else {
					System.out.println(a / i);

				}
			}
		} catch (MyError e) {
			System.out.println(e);
		} finally {
			for (int i = b + 1; i < 6; i++) {
				System.out.println(a / i);
			}
		}
	}

}

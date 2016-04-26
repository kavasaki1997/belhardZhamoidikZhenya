package Start;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		int n=1;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
				int k = 1;
		int fac = 1;
		while (true) {
			if (k > n) {
				System.out.println(fac);
				break;
			}
			fac = fac * k;
			k++;
		}

	}

}

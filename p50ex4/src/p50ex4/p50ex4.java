package p50ex4;

import java.util.Scanner;

public class p50ex4 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

}

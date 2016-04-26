package p71ex2;

import java.util.Scanner;

public class p71ex2 {

	public static void main(String[] args) {
		System.out.println("vvedite vtoruu cifru nomera");
		int n = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		switch (n) {
		case 1:
			int k = 2314;
			if ((int) (k / 1000) + (int) ((k / 100) % 10) == (k % 10 + (k / 10) % 10)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		case 2:
			int c = 224;
			if ((c % 10 + (int) ((c / 10) % 10) + (int) (c / 100) % 10) % 2 == 0) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		case 3:
			int a = 23;
			if ((a % 2 == 0) && a > 9 && a < 100) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		case 4:
			int q = 3;
			int w = 4;
			int e = 5;
			if (q * q + w * w == e * e) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		case 5:
			int v = 3466;
			if ((int) (v / 1000) != (int) ((v / 100) % 10) && (int) (v / 1000) != (int) ((v / 10) % 10)
					&& (int) (v / 1000) != v % 10 && (int) (v / 100) % 10 != (int) (v / 10) % 10
					&& (int) ((v / 100) % 10) != v % 10 && ((int) ((v / 10) % 10) != v % 10)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		case 6:
			int d = 1221;
			if ((int) (d / 1000) == d % 10 && (int) (d / 100) % 10 == (int) (d / 10) % 10) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		}

	}

}

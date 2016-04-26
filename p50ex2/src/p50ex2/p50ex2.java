package p50ex2;

import java.util.Scanner;

public class p50ex2 {

	public static void main(String[] args) {
		int n = 1;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		int kol = 0;
		
		for (int i = 0; i < n+1; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
				kol++;
			}

		}
		System.out.println("kolichestvo chisel kratnih 5 = " + kol);

	}

}

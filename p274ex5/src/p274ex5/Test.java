package p274ex5;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	private int chislo;

	public Test(int chislo) {
		this.chislo = chislo;
	}

	public static void sumirovanie(LinkedList chisla) {
		while (chisla.size() > 1) {
			LinkedList<Test> ch = new LinkedList<Test>();
			for (int i = 0; i < chisla.size() - 1; i++) {
				Test test = (Test) chisla.get(i);
				Test test2 = (Test) chisla.get(i + 1);
				test.chislo += test2.chislo;
				ch.add(test);
				chisla.remove(i + 1);
			}

			System.out.println(ch.get(0));
		}
	}

	@Override
	public String toString() {
		return "Test [chislo=" + chislo + "]";
	}

	public int getChislo() {
		return chislo;
	}

	public void setChislo(int chislo) {
		this.chislo = chislo;
	}

}

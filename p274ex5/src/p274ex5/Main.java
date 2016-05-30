package p274ex5;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Test ch1 = new Test(3);
		Test ch2 = new Test(8);
		Test ch3 = new Test(3);
		Test ch4 = new Test(2);
		Test ch5 = new Test(1);
		Test ch6 = new Test(6);
		Test ch7 = new Test(8);
		Test ch8 = new Test(0);
		Test ch9 = new Test(9);
		Test ch10 = new Test(2);
		LinkedList chisla = new LinkedList();
		chisla.add(ch1);
		chisla.add(ch2);
		chisla.add(ch3);
		chisla.add(ch4);
		chisla.add(ch5);
		chisla.add(ch6);
		chisla.add(ch7);
		chisla.add(ch8);
		chisla.add(ch9);
		chisla.add(ch10);

		Test.sumirovanie(chisla);
	}

}

package p71ex9;

public class p71ex9 {
	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; true; i += 2) {
			if (n > 55) {
				break;
			}
			System.out.println(i);
			n++;
		}
	}
}

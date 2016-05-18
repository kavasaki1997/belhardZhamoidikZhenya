import java.util.Scanner;

public class Matrix implements Arifmet {
	public int mas[][];

	public void sozdanieMasConsole() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Введите количество строк");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		Scanner sc1 = new Scanner(System.in);
		int p = 0;
		System.out.println("Введите количество столбцов");
		if (sc1.hasNextInt()) {
			p = sc1.nextInt();
		}
		mas = new int[k][p];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.println("Введите № элемента" + i + " " + j);
				Scanner sc2 = new Scanner(System.in);
				int c = 0;
				if (sc2.hasNextInt()) {
					c = sc2.nextInt();
				}
				mas[i][j] = c;

			}
		}

	}

	public void sozdanieMasRandomNuzhenRazmer(int b, int q) {
		mas = new int[b][q];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = (int) (Math.random() * 100 + 50);

			}
		}
	}

	public void vivodElemVvedinomer(int w, int e, int mas[][]) {
		System.out.println(mas[w][e]);
	}

	public void mashtabirVvediteMas(int mass[][]) {
		System.out.println("Введите на какое цело число делить");
		Scanner sc3 = new Scanner(System.in);
		int r = 0;
		if (sc3.hasNextInt()) {
			r = sc3.nextInt();
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = (int) (mas[i][j] / r);

			}
		}
	}

	public void showMas(int mas[][]) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
	}

	@Override
	public void slozh() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Введите количество строк первого масива");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		Scanner sc1 = new Scanner(System.in);
		int p = 0;
		System.out.println("Введите количество столбцов первого массива");
		if (sc1.hasNextInt()) {
			p = sc1.nextInt();
		}
		int mas1[][] = new int[k][p];

		Scanner sc3 = new Scanner(System.in);
		int w = 0;
		System.out.println("Введите количество строк второго масива");
		if (sc3.hasNextInt()) {
			w = sc3.nextInt();
		}
		Scanner sc2 = new Scanner(System.in);
		int q = 0;
		System.out.println("Введите количество столбцов второго массива");
		if (sc2.hasNextInt()) {
			q = sc2.nextInt();
		}
		int mas2[][] = new int[w][q];
		int o = 0;
		int z = 0;
		if (k > w) {
			o = k;
		} else {
			o = w;
		}
		if (p > q) {
			z = k;
		} else {
			z = w;
		}
		int mas3[][] = new int[o][z];

		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {

				mas1[i][j] = (int) (Math.random() * 11);

			}
		}
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {

				mas2[i][j] = (int) (Math.random() * 11);

			}
		}
		System.out.println("первый масив:");
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.print(mas1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("второй масив:");
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.print(mas2[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas3[i][j] = mas1[i][j];
			}
		}
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				mas3[i][j] += mas2[i][j];
			}
		}
		System.out.println("Результат сложения:");
		for (int i = 0; i < mas3.length; i++) {
			for (int j = 0; j < mas3[i].length; j++) {
				System.out.print(mas3[i][j] + "\t");
			}
			System.out.println();
		}
	}

	@Override
	public void sravn() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Введите количество строк первого масива");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		Scanner sc1 = new Scanner(System.in);
		int p = 0;
		System.out.println("Введите количество столбцов первого массива");
		if (sc1.hasNextInt()) {
			p = sc1.nextInt();
		}
		int mas1[][] = new int[k][p];

		Scanner sc3 = new Scanner(System.in);
		int w = 0;
		System.out.println("Введите количество строк второго масива");
		if (sc3.hasNextInt()) {
			w = sc3.nextInt();
		}
		Scanner sc2 = new Scanner(System.in);
		int q = 0;
		System.out.println("Введите количество столбцов второго массива");
		if (sc2.hasNextInt()) {
			q = sc2.nextInt();
		}
		int mas2[][] = new int[w][q];
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {

				mas1[i][j] = (int) (Math.random() * 11);

			}
		}
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {

				mas2[i][j] = (int) (Math.random() * 11);

			}
		}
		System.out.println("первый масив:");
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.print(mas1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("второй масив:");
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.print(mas2[i][j] + "\t");
			}
			System.out.println();
		}
		int v = 0;
		int mas3[][] = new int[k + w][p + q];
		if (k == p && w == q) {
			for (int i = 0; i < mas2.length; i++) {
				for (int j = 0; j < mas2[i].length; j++) {
					if (mas1[i][j] == mas2[i][j]) {

						continue;

					} else {
						v = 1;
						break;
					}
				}
				if (v == 1) {
					break;
				} else {
					continue;
				}
			}
		} else {
			System.out.println("не равны");
		}
		if (v == 1) {
			System.out.println("Не равны!");
		} else {
			System.out.println("Равны!");
		}

	}

}

import java.util.Scanner;

public class Vektors implements Arifmet {
	public int mas[];

	public void sozdanieMas() {
		System.out.println("Введите колличество");
		Scanner sc = new Scanner(System.in);
		int k = 0;
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		mas = new int[k];
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Введите элемент №" + (i + 1));
			Scanner sc1 = new Scanner(System.in);
			int c = 0;
			if (sc1.hasNextInt()) {
				c = sc1.nextInt();
			}
			mas[i] = c;
		}
	}

	public void sravnenieDlin(int mas1[], int mas2[]) {
		if (mas1.length == mas2.length) {
			System.out.println("Длины векторов равны");
		} else {
			System.out.println("Длины не равны");
		}
	}

	public void showMas() {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
	}

	@Override
	public void slozh() {
		System.out.println("Введите колличество элементов первого вектора");
		Scanner sc = new Scanner(System.in);
		int k = 0;
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		int mas1[] = new int[k];

		System.out.println("Введите колличество элементов второго вектора");
		Scanner sc1 = new Scanner(System.in);
		int q = 0;
		if (sc1.hasNextInt()) {
			q = sc1.nextInt();
		}
		int mas2[] = new int[q];

		for (int i = 0; i < mas1.length; i++) {
			System.out.println("Введите элемент первого вектора №" + (i + 1));
			Scanner sc2 = new Scanner(System.in);
			int c = 0;
			if (sc2.hasNextInt()) {
				c = sc2.nextInt();
			}
			mas1[i] = c;
		}

		for (int i = 0; i < mas2.length; i++) {
			System.out.println("Введите элемент второго вектора №" + (i + 1));
			Scanner sc2 = new Scanner(System.in);
			int c = 0;
			if (sc2.hasNextInt()) {
				c = sc2.nextInt();
			}
			mas2[i] = c;
		}

		System.out.println("Первый вектор:");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + "\t");
		}
		System.out.println();
		System.out.println("Второй вектор:");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + "\t");
		}
		int g = 0;
		if (mas1.length > mas2.length) {
			g = mas1.length;

		} else {
			g = mas2.length;
		}
		int mas3[] = new int[g];
		if (mas1.length > mas2.length) {
			for (int i = 0; i < mas1.length; i++) {
				mas3[i] = mas1[i];
			}
			for (int i = 0; i < mas2.length; i++) {
				mas3[i] += mas2[i];
			}
		} else {
			for (int i = 0; i < mas2.length; i++) {
				mas3[i] = mas2[i];
			}
			for (int i = 0; i < mas1.length; i++) {
				mas3[i] += mas1[i];
			}
		}
		System.out.println();
		System.out.println("Результат сложения:");
		for (int i = 0; i < mas3.length; i++) {
			System.out.print(mas3[i] + "\t");
		}
	}

	@Override
	public void sravn() {
		System.out.println("Введите колличество элементов первого вектора");
		Scanner sc = new Scanner(System.in);
		int k = 0;
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		int mas1[] = new int[k];

		System.out.println("Введите колличество элементов второго вектора");
		Scanner sc1 = new Scanner(System.in);
		int q = 0;
		if (sc1.hasNextInt()) {
			q = sc1.nextInt();
		}
		int mas2[] = new int[q];

		for (int i = 0; i < mas1.length; i++) {
			System.out.println("Введите элемент первого вектора №" + (i + 1));
			Scanner sc2 = new Scanner(System.in);
			int c = 0;
			if (sc2.hasNextInt()) {
				c = sc2.nextInt();
			}
			mas1[i] = c;
		}

		for (int i = 0; i < mas2.length; i++) {
			System.out.println("Введите элемент второго вектора №" + (i + 1));
			Scanner sc2 = new Scanner(System.in);
			int c = 0;
			if (sc2.hasNextInt()) {
				c = sc2.nextInt();
			}
			mas2[i] = c;
		}

		System.out.println("Первый вектор:");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + "\t");
		}
		System.out.println();
		System.out.println("Второй вектор:");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + "\t");
		}
		if (mas1.length == mas2.length) {
			int w = 0;
			for (int i = 0; i < mas1.length; i++) {
				if (mas1[i] == mas2[i]) {
					continue;
				} else {
					w = 1;
					break;
				}
			}
			if (w == 0) {
				System.out.println("Векторы равны!");
			} else {
				System.out.println("Векторы не равны!");
			}
		} else {
			System.out.println("Векторы не равны!");
		}

	}

}

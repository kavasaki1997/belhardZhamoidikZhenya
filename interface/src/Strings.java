import java.util.Scanner;

public class Strings implements Arifmet {
	public char mas[];

	public void sozdanieStr() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Введите количество символов");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		mas = new char[k];
		for (int i = 0; i < mas.length; i++) {
			Scanner sc1 = new Scanner(System.in);
			String p = null;
			System.out.println("Введите символ№" + i);
			if (sc1.hasNextLine()) {
				p = sc1.nextLine();
				mas[i] = p.charAt(0);
			}
		}
	}

	public void vivodMas(char mas[]) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
	}

	public void nahozhdenieEl(char mas[]) {
		System.out.println("Введите номер элемента");
		Scanner sc = new Scanner(System.in);
		int k = 0;
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		System.out.println(mas[k]);
	}

	@Override
	public void slozh() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Введите количество символов первой строки");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		Scanner sc1 = new Scanner(System.in);
		int q = 0;
		System.out.println("Введите количество символов второй строки");
		if (sc1.hasNextInt()) {
			q = sc1.nextInt();
		}
		char mas1[] = new char[k];
		for (int i = 0; i < mas1.length; i++) {
			Scanner sc2 = new Scanner(System.in);
			String p = null;
			System.out.println("Введите символ первой строки№" + (i + 1));
			if (sc2.hasNextLine()) {
				p = sc2.nextLine();
				mas1[i] = p.charAt(0);
			}
		}

		char mas2[] = new char[q];
		for (int i = 0; i < mas2.length; i++) {
			Scanner sc3 = new Scanner(System.in);
			String p = null;
			System.out.println("Введите символ второй строки№" + (i + 1));
			if (sc3.hasNextLine()) {
				p = sc3.nextLine();
				mas2[i] = p.charAt(0);
			}
		}

		System.out.println("Первая строка:");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + "\t");
		}
		System.out.println();
		System.out.println("Вторая строка:");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + "\t");
		}

		char mas3[] = new char[k + q];
		for (int i = 0; i < mas1.length; i++) {
			mas3[i] = mas1[i];
		}
		for (int i = mas1.length; i < mas1.length + mas2.length; i++) {
			mas3[i] = mas2[i - mas1.length];
		}
		System.out.println();
		System.out.println("Результат сложения:");
		for (int i = 0; i < mas3.length; i++) {
			System.out.print(mas3[i] + "\t");
		}
	}

	@Override
	public void sravn() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Введите количество символов первой строки");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		Scanner sc1 = new Scanner(System.in);
		int q = 0;
		System.out.println("Введите количество символов второй строки");
		if (sc1.hasNextInt()) {
			q = sc1.nextInt();
		}
		char mas1[] = new char[k];
		for (int i = 0; i < mas1.length; i++) {
			Scanner sc2 = new Scanner(System.in);
			String p = null;
			System.out.println("Введите символ первой строки№" + (i + 1));
			if (sc2.hasNextLine()) {
				p = sc2.nextLine();
				mas1[i] = p.charAt(0);
			}
		}

		char mas2[] = new char[q];
		for (int i = 0; i < mas2.length; i++) {
			Scanner sc3 = new Scanner(System.in);
			String p = null;
			System.out.println("Введите символ второй строки№" + (i + 1));
			if (sc3.hasNextLine()) {
				p = sc3.nextLine();
				mas2[i] = p.charAt(0);
			}
		}

		System.out.println("Первая строка:");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + "\t");
		}
		System.out.println();
		System.out.println("Вторая строка:");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + "\t");
		}
		if (k == q) {
			int a = 0;
			for (int i = 0; i < mas1.length; i++) {
				if (mas1[i] == mas2[i]) {
					continue;
				} else {
					a = 1;
					break;
				}
			}
			if (a == 1) {
				System.out.println("строки не равны");
			} else {
				System.out.println("Равны!!");
			}
		} else {
			System.out.println("Не равны!!");
		}

	}

}

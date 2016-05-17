package d;

import java.util.Scanner;

public class Animals {
	public int voice;
	public int age;
	public String name;

	public Animals(int age, String name, int voice) {
		this.age = age;
		this.name = name;
		this.voice = voice;
	}

	public Animals() {
		// TODO Auto-generated constructor stub
	}

	public void Golos() {
	}

	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		StringBuffer sb = new StringBuffer();
		sb.append(age).append(" age ").append(name).append(" name ").append(voice).append(" voice ");
		System.out.println(sb);
	}

	public void zadanie(int n) {
		Animals mas[] = new Animals[n];
		System.out.println("массив объектов какого типа создавать?");
		System.out.println("1-Dog; 2-Cat; 3-Kitty");
		Scanner sc = new Scanner(System.in);
		int k = 0;
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		} else {
			System.out.println("ввели не то");
		}
		switch (k) {
		case 1:
			for (int i = 0; i < mas.length; i++) {
				System.out.println("введите возраст");
				Scanner sc2 = new Scanner(System.in);
				int w = 0;
				if (sc2.hasNextInt()) {
					w = sc2.nextInt();
				}
				System.out.println("введите имя");
				Scanner sc3 = new Scanner(System.in);
				String e = null;
				if (sc3.hasNextLine()) {
					e = sc3.nextLine();
				}
				System.out.println("введите voice");
				Scanner sc4 = new Scanner(System.in);
				int r = 0;
				if (sc4.hasNextInt()) {
					r = sc4.nextInt();
				}

				mas[i] = new Animals(w, e, r);
			}
			System.out.println(" ");
			for (int i = 0; i < mas.length; i++) {
				mas[i].show();
			}
			break;
		case 2:
			for (int i = 0; i < mas.length; i++) {
				System.out.println("введите количество мышей");
				Scanner sc1 = new Scanner(System.in);
				int q = 0;
				if (sc1.hasNextInt()) {
					q = sc1.nextInt();
				}
				System.out.println("введите возраст");
				Scanner sc2 = new Scanner(System.in);
				int w = 0;
				if (sc2.hasNextInt()) {
					w = sc2.nextInt();
				}
				System.out.println("введите имя");
				Scanner sc3 = new Scanner(System.in);
				String e = null;
				if (sc3.hasNextLine()) {
					e = sc3.nextLine();
				}
				System.out.println("введите voice");
				Scanner sc4 = new Scanner(System.in);
				int r = 0;
				if (sc4.hasNextInt()) {
					r = sc4.nextInt();
				}

				mas[i] = new Cat(q, w, e, r);
			}
			System.out.println(" ");
			for (int i = 0; i < mas.length; i++) {
				mas[i].show();
			}
			break;
		case 3:
			for (int i = 0; i < mas.length; i++) {
				System.out.println("введите время");
				Scanner sc0 = new Scanner(System.in);
				int t = 0;
				if (sc0.hasNextInt()) {
					t = sc0.nextInt();
				}
				System.out.println("введите количество мышей");
				Scanner sc1 = new Scanner(System.in);
				int q = 0;
				if (sc1.hasNextInt()) {
					q = sc1.nextInt();
				}
				System.out.println("введите возраст");
				Scanner sc2 = new Scanner(System.in);
				int w = 0;
				if (sc2.hasNextInt()) {
					w = sc2.nextInt();
				}
				System.out.println("введите имя");
				Scanner sc3 = new Scanner(System.in);
				String e = null;
				if (sc3.hasNextLine()) {
					e = sc3.nextLine();
				}
				System.out.println("введите voice");
				Scanner sc4 = new Scanner(System.in);
				int r = 0;
				if (sc4.hasNextInt()) {
					r = sc4.nextInt();
				}

				mas[i] = new Kitty(t, q, w, e, r);
			}
			System.out.println(" ");
			for (int i = 0; i < mas.length; i++) {
				mas[i].show();
				System.out.println(" ");
			}
			break;
		default:
			System.out.println("ввели что-то не то");
		}
	}

}

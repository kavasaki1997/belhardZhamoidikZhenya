public class Student {
	public int numberCourse;
	public String nameStudent;
	public int mass[];

	public Student(int numberCourse, String nameStudent) {
		this.numberCourse = numberCourse;

	}

	public Student() {
		numberCourse = 4;
		nameStudent = "sdfgfg";
	}

	public static void plos(double n) {
		System.out.println("plosh kvadrata=" + n);
	}

	public static void plos(int r) {
		System.out.println("plosh kruga=" + 2 * 3 / 14 * r);
	}

	public static void plos(double a, double b) {
		System.out.println("plosh pryamougolnika=" + a * b);
	}

	public void show() {
		System.out.println(numberCourse + " " + nameStudent);
	}

	public Student(int p) {
		mass = new int[p];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 11 + 0);
		}
		for (int i = 0; i < mass.length; i++) {

		}
	}

	public void sredBall(int mass[]) {

		int s = 0;
		for (int i = 0; i < mass.length; i++) {

			s += mass[i];

		}
		System.out.println(s / mass.length);

	}

}

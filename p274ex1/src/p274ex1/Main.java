package p274ex1;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("zs", 213);
		Student st2 = new Student("zsdfs", 2513);
		Student st3 = new Student("zdsafs", 2513);
		Student st4 = new Student("z1s", 24513);
		Student st5 = new Student("zkhs", 213);
		Student st6 = new Student("zsh", 213);
		Student st7 = new Student("zhjks", 2123);
		Student st8 = new Student("zs", 213);
		Student st9 = new Student("zsvn", 2813);
		Student st10 = new Student("zcbs", 2173);
		LinkedList student = new LinkedList();
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.add(st4);
		student.add(st5);
		LinkedList student1 = new LinkedList();
		student1.add(st6);
		student1.add(st7);
		student1.add(st8);
		student1.add(st9);
		student1.add(st10);

		// Student.union(student, student1);
		// Student.intersect(student, student1);
		// Student.printStudent(student, 213);
	}

}

package p274ex1;

import java.util.LinkedList;

public class Student {

	private String name = new String();
	private int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public void getName(Student st) {
		System.out.println(st.name);
	}

	public void getCourse(Student st) {
		System.out.println(st.course);
	}

	public static void printStudent(LinkedList student, int course) {
		System.out.println("Имена студентов с курсом номер:" + course);
		for (int i = 0; i < student.size(); i++) {
			Student test = (Student) student.get(i);
			if (test.course == course) {
				System.out.print(test.name + " ");
			}
		}
	}

	public static void union(LinkedList st1, LinkedList st2) {
		LinkedList<Student> student = new LinkedList<Student>();
		for (int i = 0; i < st1.size(); i++) {
			Student test1 = (Student) st1.get(i);
			for (int j = 0; j < st2.size(); j++) {
				Student test2 = (Student) st2.get(j);
				if (test1.course == test2.course && test1.name == test2.name) {
					student.add(test1);
					st1.remove(i);
					st2.remove(j);

				}
			}
		}

		for (int i = 0; i < st1.size(); i++) {
			student.add((Student) st1.get(i));
		}
		for (int i = 0; i < st2.size(); i++) {
			student.add((Student) st2.get(i));
		}
		System.out.println("Результат объединения:");
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i));

		}
	}

	public static void intersect(LinkedList st1, LinkedList st2) {
		LinkedList<Student> student = new LinkedList<Student>();
		for (int i = 0; i < st1.size(); i++) {
			Student test1 = (Student) st1.get(i);
			for (int j = 0; j < st2.size(); j++) {
				Student test2 = (Student) st2.get(j);
				if (test1.course == test2.course && test1.name == test2.name) {
					student.add(test1);
					st1.remove(i);
					st2.remove(j);

				}
			}
		}

		System.out.println("Результат пересечения:");
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i));

		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

}

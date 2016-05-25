
public class Test<T extends Number, V extends Number> {
	private T ob;
	private V ob2;

	public Test(T ob, V ob2) {
		this.ob = ob;
		this.ob2 = ob2;
	}

	public V getOb2() {
		return ob2;
	}

	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}

	public void test(T ob, V ob2) {
		double sum = 0;
		sum = ob.doubleValue() + ob2.doubleValue();
		System.out.println("Сумма =" + sum);
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public static <T extends Number, V extends Number> void meth(T[] a, V[] b) {
		int k = 0;
		int c = 0;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i].doubleValue() == b[i].doubleValue()) {
					continue;
				} else {
					k = 1;
					break;
				}
			}
			if (k == 0) {
				System.out.println("массивы равны");
			} else {
				System.out.println("массивы не равны");
			}
		} else {
			System.out.println("массивы не равны");
		}
	}

	public static <T extends Number, V extends Number> void maxMin(T[] a, V[] b) {
		int k = 0;
		double aMax = a[0].doubleValue();
		double aMin = a[0].doubleValue();
		double bMax = b[0].doubleValue();
		double bMin = b[0].doubleValue();

		for (int i = 1; i < a.length; i++) {
			if (a[i].doubleValue() > aMax) {
				aMax = a[i].doubleValue();
			} else {
				if (a[i].doubleValue() < aMin) {
					aMin = a[i].doubleValue();
				}
			}
		}

		for (int i = 1; i < b.length; i++) {
			if (b[i].doubleValue() > bMax) {
				bMax = b[i].doubleValue();
			} else {
				if (b[i].doubleValue() < bMin) {
					bMin = b[i].doubleValue();
				}

			}
		}
		System.out.println("максимальный элемент а=" + aMax);
		System.out.println("максимальный элемент b=" + bMax);
		System.out.println("минимальный элемент а=" + aMin);
		System.out.println("минимальный элемент b=" + bMin);
	}

}

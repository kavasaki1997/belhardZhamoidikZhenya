
public class MyError extends Exception {
	public String nameError;

	public MyError(String nameError) {
		this.nameError = nameError;
	}

	@Override
	public String toString() {
		return nameError;
	}

}

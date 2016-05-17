package d;

public class Kitty extends Cat {
	public int time;

	public Kitty(int time, int mouse, int age, String name, int voice) {
		super(mouse, age, name, voice);
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void show() {
		System.out.print(time + " time ");
		super.show();

	}

}

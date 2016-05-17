package d;

public class Cat extends Animals{
	

	public int mouse;

	public Cat(int mouse, int age, String name, int voice) {
		super(age, name, voice);
		this.mouse = mouse;
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public int getMouse() {
		return mouse;
	}

	public void setMouse(int mouse) {
		this.mouse = mouse;
	}
	public void Golos(){
		System.out.println("may-may");
	}

	public void show() {
		System.out.println(mouse + " mouse ");
		super.show();

	}
}

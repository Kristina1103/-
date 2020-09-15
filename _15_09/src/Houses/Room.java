package Houses;

public class Room {
	protected int a, b;

	public Room(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int s() {
		return this.a * this.b;
	}

	public String toString() {
		return this.a + " x " + this.b;
	}
}
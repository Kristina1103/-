package Houses;

public class Flat {
	public Room kitchen, hall;

	public Flat(int size[]) {
		kitchen = new Room(size[0], size[1]);
		hall = new Room(size[2], size[3]);
	}

	public int s() {
		return this.kitchen.s() + this.hall.s();
	}

	public String toString() {
		return "1 комнатная кв с кухней: " + this.kitchen.toString() + " и гостинной " + this.hall.toString();
	}

	public int s1() {
		return this.kitchen.s();
	}
}
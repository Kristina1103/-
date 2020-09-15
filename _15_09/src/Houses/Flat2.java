package Houses;

public class Flat2 extends Flat {
	public Room bedroom;

	public Flat2(int size[]) {
		super(size);
		this.bedroom = new Room(size[4], size[5]);
	}

	public int s() {
		return this.kitchen.s() + this.hall.s() + this.bedroom.s();
	}

	public String toString() {
		return "2 комнатная кв с кухней: " + this.kitchen.toString() + ", гостинной " + this.hall.toString()
				+ " и спальней " + this.bedroom.s();
	}
	
	public int s1() {
		return this.bedroom.s();
	}
	}

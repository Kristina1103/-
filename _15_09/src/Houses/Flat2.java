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
		return "2 ��������� �� � ������: " + this.kitchen.toString() + ", ��������� " + this.hall.toString()
				+ " � �������� " + this.bedroom.s();
	}
	
	public int s1() {
		return this.bedroom.s();
	}
	}

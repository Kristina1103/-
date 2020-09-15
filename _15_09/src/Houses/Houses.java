package Houses;

public class Houses {
	public Flat flats[];

	public Houses(int size[][]) {
		this.flats = new Flat[size.length];
		for (int i = 0; i < size.length; i++)
			if (size[i][4] == 0)
				flats[i] = new Flat(size[i]);
			else
				flats[i] = new Flat2(size[i]);
	}

	public String toString() {
		String p = "Дом состоит из квартир:";
		for (int i = 0; i < this.flats.length; i++)
			p = p + "\n" + this.flats[i].toString();
		return p;
	}

	public int average1() {
		int s1 = 0, k1 = 0;
		for (int i = 0; i < flats.length; i++)
			if (!(flats[i] instanceof Flat2)) {
				s1 += flats[i].s();
				k1++;
			}
		return s1 / k1;
	}

	public int average2() {
		int s2 = 0, k2 = 0;
		for (int i = 0; i < flats.length; i++)
			if (flats[i] instanceof Flat2) {
				s2 += flats[i].s();
				k2++;
			}
		return s2 / k2;
	}
public int max1(){
	int s = 0;
	for (int i = 0; i < flats.length; i++)
		if (!(flats[i] instanceof Flat2) && flats[i].s()>s) {
			s = flats[i].s();
			
		}
	return s;
}
public int max2(){
	int s = 0;
	for (int i = 0; i < flats.length; i++)
		if ((flats[i] instanceof Flat2) && flats[i].s()>s) {
			s = flats[i].s();
			
		}
	return s;
}

public int averageBedroom(){
	int k=0, s= 0;
	for (int i = 0; i < flats.length; i++)
		if (flats[i] instanceof Flat2) {
			s += flats[i].s1() ;
			k++;
		}
	return s/k;
}
}
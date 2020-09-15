package _15_09;

public class Programmer extends Abs {
private int count;
public Programmer(String name,int ok, int count) {
	super();
	this.count=count;
}
public int salary() {
	return (int)(this.ok+this.ok*this.count*0.2);
	
}
public String toString() {
	return "Программист: "+this.name;
}
}

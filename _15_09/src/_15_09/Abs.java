package _15_09;

public abstract  class Abs {//конструктор не может быть абстрактным 
	protected String name;
	protected int ok;
	public void worker (String name,int ok) {
		this.name=name;
		this.ok=ok;
	}
abstract public int salary();
abstract public String toString();
}

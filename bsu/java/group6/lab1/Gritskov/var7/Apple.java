package bsu.java.group6.lab1.Gritskov.var7;

public class Apple extends Food {

	private String size;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Apple(String size) {
		super("Apple");
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " of size " + size.toUpperCase();
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			if (!(obj instanceof Apple)) return false;
			return size.equals(((Apple)obj).size);
		}
		else {
			return false;
		}
	}
	
	
}

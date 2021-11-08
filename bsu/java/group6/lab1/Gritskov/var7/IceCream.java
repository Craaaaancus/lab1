package bsu.java.group6.lab1.Gritskov.var7;

public class IceCream extends Food {

	private String sirop;
	

	public String getSirop() {
		return sirop;
	}

	public void setSirop(String sirop) {
		this.sirop = sirop;
	}

	public IceCream(String sirop) {
		super("IceCream");
		this.sirop = sirop;
	}

	
	@Override
	public String toString() {	
		return super.toString() + " with " + sirop.toUpperCase() + " sirop";
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			if (!(obj instanceof IceCream)) return false;
			return sirop.equals(((IceCream)obj).sirop);
		}
		else {
			return false;
		}
	}

}

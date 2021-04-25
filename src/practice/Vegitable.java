package practice;

public class Vegitable {
	public String name;
	public int quantity;

	public Vegitable(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public Vegitable order(int quantityToAdd) {
		return new Vegitable(this.name, this.quantity + quantityToAdd);
	}

	@Override
	public String toString() {
		return name + ": " + quantity + "個";
	}
}

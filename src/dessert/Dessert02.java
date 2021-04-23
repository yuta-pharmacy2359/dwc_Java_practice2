package dessert;

public enum Dessert02 {
	APPLE(100),
	ICE_CREAM(200),
	CAKE(300),
	CANDY(50),
	CHOCOLATE(150),
	GUM(75),;

	private int price;

	private Dessert02(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

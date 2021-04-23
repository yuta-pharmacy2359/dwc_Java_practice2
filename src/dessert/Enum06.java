package dessert;

public class Enum06 {
	public static void main(String[] args) {
		System.out.println(Dessert02.APPLE.getPrice());
		System.out.println(Dessert02.CAKE.getPrice());
		System.out.println(Dessert02.CHOCOLATE.getPrice());

		Dessert03.ICE_CREAM.advertise();
		Dessert03.CANDY.advertise();
		Dessert03.GUM.advertise();
	}
}

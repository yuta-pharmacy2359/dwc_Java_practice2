package dessert;

public class Enum05 {
	public static void main(String[] args) {
		System.out.println(Dessert.APPLE.name());

		Dessert iceCream = Dessert.valueOf("ICE_CREAM");
		System.out.println(iceCream);

		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CANDY.ordinal());
		System.out.println(Dessert.GUM.ordinal());
	}
}

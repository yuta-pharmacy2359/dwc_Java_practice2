package dessert;

public class Enum04 {
	public static void main(String[] args) {
		Dessert x = Dessert.APPLE;
		Dessert y = Dessert.APPLE;

		System.out.println(x == y);
		System.out.println(x.equals(y));
	}
}

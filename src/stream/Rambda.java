package stream;

import java.util.ArrayList;
import java.util.List;

public class Rambda {
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();

		fruits.add(new Fruit("栗", 4));
		fruits.add(new Fruit("レモン", 17));
		fruits.add(new Fruit("びわ", 4));
		fruits.add(new Fruit("桃", 9));
		fruits.add(new Fruit("ブルーベリー", 6));

		fruits.stream()
			.filter(f -> f.quantity <= 10)
			.map(f -> f.order(20))
			.sorted((f1, f2) -> f1.quantity - f2.quantity)
			.forEach(System.out::println);
	}
}

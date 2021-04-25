package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter07 {
	public static void main(String[] args) {
		List<Vegitable> vegitables = new ArrayList<>();

		vegitables.add(new Vegitable("きゅうり", 6));
		vegitables.add(new Vegitable("たまねぎ", 13));
		vegitables.add(new Vegitable("白菜", 4));
		vegitables.add(new Vegitable("トマト", 8));
		vegitables.add(new Vegitable("レタス", 11));
		vegitables.add(new Vegitable("大根", 5));

		long count = vegitables.stream()
			.filter(f -> f.quantity <= 10)
			.count();
		System.out.println(count);

		List<Vegitable> sortedVegitables = vegitables.stream()
			.sorted((f1, f2) -> f2.quantity - f1.quantity)
			.collect(Collectors.toList());
		System.out.println(sortedVegitables);
	}
}

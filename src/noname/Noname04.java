package noname;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Noname04 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 3);

		Collections.sort(
			numbers,
			new Comparator<Integer>() {
				@Override
				public int compare(Integer x, Integer y) {
					return Integer.compare(x, y);
				}
			}
		);
		System.out.println(numbers);
	}
}

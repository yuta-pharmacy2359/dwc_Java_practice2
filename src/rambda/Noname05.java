package rambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Noname05 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 3);

		Collections.sort(
			numbers,
			(Integer x, Integer y) -> {
				return Integer.compare(x, y);
		});
		System.out.println(numbers);
	}
}

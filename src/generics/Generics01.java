package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics01 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();

		items.add("bag");
		//items.add(12);
		//items.add(false);

		String item = items.get(0);
		//int item = items.get(0);
		//boolean item = items.get(0);
		System.out.println(item);
	}
}

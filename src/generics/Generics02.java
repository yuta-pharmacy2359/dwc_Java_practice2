package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics02 {
	public static void main(String[] args) {
		List<Object> items = new ArrayList<Object>();

		items.add("bag");
		items.add(18);
		items.add(true);

		for (Object item : items) {
			System.out.println(item);
		}

		String item1 = (String)items.get(0);
		System.out.println(item1);

		//String item2 = (String)items.get(1);
		//System.out.println(item2);
	}
}

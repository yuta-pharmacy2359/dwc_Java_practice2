package CollectionAPI;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();

		list1.add("りんご");
		list1.add("みかん");
		list1.add(1, "バナナ");
		list1.add(3, "ドリアン");

		System.out.println(list1.get(3));
		System.out.println(list1.contains("バナナ"));
		System.out.println(list1.contains("スイカ"));
		System.out.println(list1.size());

		list1.remove("ドリアン");
		System.out.println(list1.contains("ドリアン"));

		list2.add(338);
		list2.add(594);
		list2.add(1, 773);
		list2.add(3, 861);

		System.out.println(list2.get(3));

		for (int listFor : list2) {
			System.out.println(listFor);
		}
	}
}

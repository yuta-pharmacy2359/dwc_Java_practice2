package CollectionAPI;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set01 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("スイカ");
		set1.add("メロン");
		set1.add("ぶどう");
		set1.add("みかん");

		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("レモン"));
		System.out.println(set1.size());

		set1.remove("みかん");
		set1.remove("梨");

		System.out.println(set1.size());

		set2.add(1125);
		set2.add(3781);
		set2.add(4534);
		set2.add(8713);

		System.out.println(set2.contains(3781));
		System.out.println(set2.contains(7563));
	}
}

package CollectionAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();

		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		map1.put(0, "マスカット");

		System.out.println(map1.get(0));
		System.out.println(map1.get(1));

		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));

		System.out.println(map1.size());

		map1.remove(0);
		map1.remove(1);
		map1.remove(3, "もも");
		map1.remove(3, "いちご");

		System.out.println(map1.size());

		map2.put("果物", "ぶどう");
		map2.put("野菜", "きゅうり");
		map2.put("果物", "レモン");

		System.out.println(map2.get("野菜"));
		System.out.println(map2.get("魚"));
		System.out.println(map2.size());
	}
}

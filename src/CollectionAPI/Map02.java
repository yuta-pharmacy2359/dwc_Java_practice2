package CollectionAPI;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
	public static void main(String[] args) {
		Map<Integer, String> classmates = new HashMap<>();

		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");
		classmates.put(4, "西村");
		classmates.put(5, "戸越");

		for (Integer key : classmates.keySet()) {
			System.out.println(key);
		}

		for (String name : classmates.values()) {
			System.out.println(name);
		}

		for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
			System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん");
		}
	}

}

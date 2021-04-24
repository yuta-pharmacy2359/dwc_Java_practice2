package rambda;

public class Greeting_rambda02 {
	public static void main(String[] args) {
		Greeting2 greeting = (String word) -> {
			return word + " 私は元気です。";
		};
		String greeting2 = greeting.hello("こんにちは!");
		System.out.println(greeting2);
	}
}

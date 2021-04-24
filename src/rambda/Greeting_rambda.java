package rambda;

public class Greeting_rambda {
	public static void main(String[] args) {
		Greeting greeting = () -> {
			return "こんにちは";
		};
		System.out.println(greeting.hello());
	}
}

package practice;

public class Chapter01 {
	public static void main(String[] args) {
		new Human().new HumanLeg().kick();

		Human human1 = new Human();
		Human.HumanLeg leg1 = human1.new HumanLeg();
		leg1.kick();
	}
}

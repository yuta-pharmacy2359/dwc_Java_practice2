package practice;

public class Soldier implements Character {
	private int hp;

	public Soldier (int hp) {
		this.hp = hp;
	}

	@Override
	public int attack() {
		System.out.println("戦士の会心の一撃!");
		return hp;
	}
}

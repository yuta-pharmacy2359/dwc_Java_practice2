package practice;

public class Magician implements Character {
	private int hp;

	public Magician (int hp) {
		this.hp = hp;
	}

	@Override
	public int attack() {
		System.out.println("魔女の必殺魔法!");
		return hp;
	}
}

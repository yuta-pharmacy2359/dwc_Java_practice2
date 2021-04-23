package practice;

public class Playboy implements Character {
	private int hp;

	public Playboy(int hp) {
		this.hp = hp;
	}

	@Override
	public int attack() {
		System.out.println("遊び人は、ただ遊んでいるだけだった!");
		return hp;
	}
}

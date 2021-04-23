package practice;

import java.util.ArrayList;
import java.util.List;

public class Chapter14 {
	public static void main(String[] args) {
		List<Character> party = new ArrayList<Character>();
			party.add(new Soldier(100));
			party.add(new Playboy(0));
			party.add(new Magician(300));
		Chapter14.partyAttack(party);
	}

	public static void partyAttack(List<Character> party) {
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント:" + hp);
		}
	}
}

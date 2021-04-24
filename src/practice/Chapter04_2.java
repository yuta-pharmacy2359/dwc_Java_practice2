package practice;

import java.math.BigDecimal;

public class Chapter04_2 {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));
		Basket<Strawberry> strawberryBasket = new Basket<>(new Strawberry("とちおとめ", new BigDecimal(400)));

		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
		strawberryBasket.printTotalPrice();
	}
}

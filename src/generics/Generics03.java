package generics;

public class Generics03 {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName());

		appleBasket.replace(new Apple("紅玉"));
		System.out.println(appleBasket.get().getName());

		//appleBasket.replace(new Peach("黄金桃"));

		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃"));
		System.out.println(peachBasket.get().getName());
	}
}

package dessert;

public enum Dessert03 {

	APPLE(100) {
		@Override
		void advertise() {
			System.out.println("真っ赤なリンゴが" + getPrice() + "円!");
		}
	},

	ICE_CREAM(200) {
		@Override
		void advertise() {
			System.out.println("夏にピッタリアイスクリームが" + getPrice() + "円!");
		}
	},

	CAKE(300) {
		@Override
		void advertise() {
			System.out.println("みんな大好き甘いケーキが" + getPrice() + "円!");
		}
	},

	CANDY(50) {
		@Override
		void advertise() {
			System.out.println("お手軽甘いキャンディーが" + getPrice() + "円!");
		}
	},

	CHOCOLATE(150) {
		@Override
		void advertise() {
			System.out.println("甘くてほろ苦いチョコレートが" + getPrice() + "円!");
		}
	},

	GUM(75) {
		@Override
		void advertise() {
			System.out.println("噛んで爽やかガムが" + getPrice() + "円!");
		}
	},;

	private int price;

	private Dessert03(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	abstract void advertise();
}

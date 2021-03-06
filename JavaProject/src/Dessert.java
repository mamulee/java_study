
public class Dessert {
	String type; // 디저트 종류
	String flavour; // 맛
	int price; // 가격
	int stock; // 수량
	int sales; // 판매량
	int revenue; // 수입
	
	public Dessert(String type, String flavour, int price, int stock) {
		this.type = type;
		this.flavour = flavour;
		this.price = price;
		this.stock = stock;
	}
	
	public void calc() {
		this.revenue = this.price * this.sales;
	}
	
	@Override
	public String toString() {
		return this.flavour+"                "+this.price+"            "+this.stock;
	}
}

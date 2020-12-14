package GenericEx;

public class ProductEx {

	public static void main(String[] args) {

		Product<Tv, String, Integer> productTv = new Product<Tv, String, Integer>();

		productTv.setKind(new Tv());
		productTv.setModel("sm-1001");
		productTv.setPrice(2000000);

	}

}

class Product<T, M, I> {
	private T kind;
	private M model;
	private I price;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public I getPrice() {
		return price;
	}
	public void setPrice(I price) {
		this.price = price;
	}
	
}

class Tv {
	
	Tv() {
		
	}

}
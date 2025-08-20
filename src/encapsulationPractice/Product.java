package encapsulationPractice;

public class Product {
	private String productName;
	private double price;
	private int quantity;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double totalValue(double value) {
		value = price * quantity;
		return value;
	}
	
	public static void main(String[] args) {
		Product pd = new Product();
		pd.setProductName("GPU");
		pd.setPrice(200000);
		pd.setQuantity(5);
		
		System.out.println("the total value of " + pd.getProductName() + " is " + pd.totalValue(0));
	}
}

package co.hw1.model.vo;

public class Product {

	// 필드부
	private String productId;		// 상품아이디
	private String productName;		// 상품명
	private String productArea;		// 생산지
	private int price;				// 가격
	private double tax;				// 부가세
	
	
	// 생성자부 (기본 + 전체)
	public Product() { // 기본생성자
		
	}
	
	public Product(String productId, String productName, String productArea, int price, double tax) { // 전체 생성자
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	
	// 메소드부 (get - set 한세트로 작성)
	public String information() {
		return productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProducId() {
		return productId;
	}
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}
	
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public String getProductArea() {
		return productArea;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTax(){
		return tax;
	}
}










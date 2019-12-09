package com.face.bo;

public class ProductBo {
	private String product; 
	private String id;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	private String quantity;
    private String price;
	public String getId() {
		
		return id;
	}
}

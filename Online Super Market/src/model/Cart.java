/**
 * 
 */
package model;

import java.sql.Time;
import model.Product;
/**
 * <p> Cart model object.
 * <p>Contains various attributes of model and its getters and setters. 
 * @author Mukilan.K
 *
 * @version 1.0

 */
public class Cart {
	

	private int id;
    private int orderId;
    private Product product;
    private int quantity;
    private double totalPrice;
    private Time createdAt;
    private Time modifiedAt;
    private int createdBy;
    private int modifiedBy;

	/**
	 * 
	 */
	public Cart() {
	}

	/**
	 * @param purchaseOrder
	 * @param product
	 * @param quantity
	 * @param totalPrice
	 * @param createdAt
	 * @param modifiedAt
	 * @param createdBy
	 * @param modifiedBy
	 */
	public Cart(int orderId, Product product, int quantity, double totalPrice, Time createdAt,
			Time modifiedAt, int createdBy, int modifiedBy) {
		this.setOrderId(orderId);
		this.setProduct(product);
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Time getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Time createdAt) {
		this.createdAt = createdAt;
	}

	public Time getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Time modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}

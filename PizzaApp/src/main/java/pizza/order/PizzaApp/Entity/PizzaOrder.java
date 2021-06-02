package pizza.order.PizzaApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PizzaOrder {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long orderID;
	
	private String orderItems;
	private String orderAddress;
	private String orderCoupon;
	public long getOrderID() {
		return orderID;
	}
	@Override
	public String toString() {
		return "PizzaOrder [orderID=" + orderID + ", orderItems=" + orderItems + ", orderAddress=" + orderAddress
				+ ", orderCoupon=" + orderCoupon + "]";
	}
	public PizzaOrder() {
		super();
	}
	public PizzaOrder(long orderID, String orderItems, String orderAddress, String orderCoupon) {
		super();
		this.orderID = orderID;
		this.orderItems = orderItems;
		this.orderAddress = orderAddress;
		this.orderCoupon = orderCoupon;
	}
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}
	public String getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(String orderItems) {
		this.orderItems = orderItems;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderCoupon() {
		return orderCoupon;
	}
	public void setOrderCoupon(String orderCoupon) {
		this.orderCoupon = orderCoupon;
	}
}

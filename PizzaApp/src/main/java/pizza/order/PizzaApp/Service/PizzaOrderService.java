package pizza.order.PizzaApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import pizza.order.PizzaApp.Entity.PizzaOrder;

@Service
public interface PizzaOrderService {

	List<PizzaOrder> getAllOrders();

	PizzaOrder addNewOrder(PizzaOrder pizzaOrder);

	PizzaOrder getOrderById(long id);

	void deleteOrderById(long id);

	PizzaOrder updateOrder(long id, PizzaOrder pizzaOrder);

}

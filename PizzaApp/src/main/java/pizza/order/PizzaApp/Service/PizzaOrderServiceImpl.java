package pizza.order.PizzaApp.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pizza.order.PizzaApp.Entity.PizzaOrder;
import pizza.order.PizzaApp.Repository.PizzaOrderRepository;

@Service
public class PizzaOrderServiceImpl implements PizzaOrderService{
	
	@Autowired
	PizzaOrderRepository repository;
	
	@Override
	public List<PizzaOrder> getAllOrders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public PizzaOrder addNewOrder(PizzaOrder pizzaOrder) {
		// TODO Auto-generated method stub
		return repository.save(pizzaOrder);
	}

	@Override
	public PizzaOrder getOrderById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteOrderById(long id) {
		repository.deleteById(id);
		
	}

	@Override
	public PizzaOrder updateOrder(long id, PizzaOrder pizzaOrder) {
		// TODO Auto-generated method stub
		PizzaOrder newOrder = repository.findById(id).get();
		if(Objects.nonNull(pizzaOrder.getOrderItems())&&!"".equals(pizzaOrder.getOrderItems())) {
			newOrder.setOrderItems(pizzaOrder.getOrderItems());
		}
		if(Objects.nonNull(pizzaOrder.getOrderAddress())&&!"".equals(pizzaOrder.getOrderAddress())) {
			newOrder.setOrderAddress(pizzaOrder.getOrderAddress());
		}
		if(Objects.nonNull(pizzaOrder.getOrderCoupon())&&!"".equals(pizzaOrder.getOrderCoupon())) {
			newOrder.setOrderCoupon(pizzaOrder.getOrderCoupon());
		}
		return repository.save(newOrder);
	}

	

}

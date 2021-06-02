package pizza.order.PizzaApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pizza.order.PizzaApp.Entity.PizzaOrder;
import pizza.order.PizzaApp.Service.PizzaOrderService;

@RestController
public class PizzaOrderController {
	
	@Autowired
	PizzaOrderService service;
	
	@GetMapping("/Orders")
	public List<PizzaOrder> getAllOrders() {
		return service.getAllOrders();
	}
	
	@PostMapping("/Orders")
	public PizzaOrder addNewOrder(@RequestBody PizzaOrder pizzaOrder) {
		return service.addNewOrder(pizzaOrder);
		
	}
	
	@GetMapping("/Orders/{id}")
	public PizzaOrder getOrderById(@PathVariable("id") long id) {
		return service.getOrderById(id);
	}
	
	@DeleteMapping("/Orders/{id}")
	public String deleteOrderById(@PathVariable("id") long id) {
		service.deleteOrderById(id);
		return "Deleted order no. "+id;
	}
	
	@PutMapping("/Orders/{id}")
	public PizzaOrder updateOrder(@PathVariable("id") long id, @RequestBody PizzaOrder pizzaOrder) {
		return service.updateOrder(id,pizzaOrder);
	}
}

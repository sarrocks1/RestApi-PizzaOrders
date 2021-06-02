package pizza.order.PizzaApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pizza.order.PizzaApp.Entity.PizzaOrder;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long>{
	
}

package pizza.order.PizzaApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String displayHomePage() {
		return "HomePage";
	}

}

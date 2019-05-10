package itc.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/flyDubai")
	public String Greeting() {
		return "Welcome to Spring boot App";
	}

}

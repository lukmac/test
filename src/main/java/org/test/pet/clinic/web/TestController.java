package org.test.pet.clinic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/showMessage.html")
	public String showMessage() {
		return "showMessage";
	}
	
}

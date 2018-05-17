package com.alex.singlepageapp.contrloller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shishkov A.V. on 17.05.18.
 */
@Controller
@RequestMapping(value = {"", "/"})
public class WelcomeController {
	@GetMapping
	public String welcome() {
		return "welcome";
	}
}

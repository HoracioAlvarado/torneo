package ar.com.buho.torneo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPagesController {

	@RequestMapping("/")
	public String home() {
		return "index";
		
	}
}

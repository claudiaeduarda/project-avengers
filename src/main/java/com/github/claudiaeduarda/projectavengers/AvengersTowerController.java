package com.github.claudiaeduarda.projectavengers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AvengersTowerController {

	@RequestMapping("/cadastroAvengersTower")
	public String form() {
		return "avengerstower/formAvengersTower";
	}
}

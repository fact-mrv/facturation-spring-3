package com.meruvia.Facturation3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class IndexController {

	@GetMapping("/")
	public ModelAndView index() {
		
		ModelAndView mav = new ModelAndView("index");
		
		return mav;
	}
	
	@GetMapping("/template")
	public ModelAndView template() {
		
		ModelAndView mav = new ModelAndView("layout/template");
		
		return mav;
	}
}

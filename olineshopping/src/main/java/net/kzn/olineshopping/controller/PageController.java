package net.kzn.olineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", "Welcome To Spring Web MVC");
		mv.addObject("mausam", "Mausam hai Mast...");
		mv.addObject("Chutia", "Tu chutiya hai...");
		return mv;
	}
}

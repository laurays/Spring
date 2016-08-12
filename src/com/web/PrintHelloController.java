package com.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrintHelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(PrintHelloController.class);
	
	/*@RequestMapping("/hello")
	public ModelAndView helloView(){		
		ModelAndView view = new ModelAndView();
		view.setViewName("/helloSpring");
		return view;
	}*/
	
	@RequestMapping(value="login.do", method=RequestMethod.GET)
	public String login(Model model){
		int amount = 1001;
		int balance = 10000;
		
		logger.info("amount:{}, balance{}", amount, balance);
		
		return "helloSpring";
	}
	
	@RequestMapping(value="view1.do", method=RequestMethod.GET)
	public String view1(Model model){		
		return "view1";
	}	
}









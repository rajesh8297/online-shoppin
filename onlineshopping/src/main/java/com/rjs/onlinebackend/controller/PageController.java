package com.rjs.onlinebackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("Gtreetings", "wel come spring program");
		return mv;
	}
	
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="Gtreetings" , required = false ) String Gtreeting){
		if(Gtreeting == null) {
			Gtreeting = "say hello";
		}
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("Gtreetings", Gtreeting);
		return mv;
	}*/
	/*
	@RequestMapping(value="/test/{Gtreeting}")
	public ModelAndView test(@PathVariable("Gtreeting") String Gtreeting){
		if(Gtreeting == null) {
			Gtreeting = "say hello";
		}
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("Gtreetings", Gtreeting);
		return mv;
	}
*/

}

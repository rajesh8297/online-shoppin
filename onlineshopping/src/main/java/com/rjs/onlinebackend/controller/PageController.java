package com.rjs.onlinebackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about() {
		
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView Contact() {
		
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	@RequestMapping(value="/services")
	public ModelAndView Services() {
		
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Services");
		mv.addObject("userClickServices", true);
		return mv;
	}
	
	@RequestMapping(value="/branches")
	public ModelAndView Branches() {
		
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Branches");
		mv.addObject("userClickBranches", true);
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

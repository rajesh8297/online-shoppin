package com.rjs.onlinebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rjs.onlinebackend.dao.CategoryDAO;
import com.rjs.onlinebackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Home");
		mv.addObject("categeries",categoryDAO.list());
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
	
	@RequestMapping(value= "/show/all/products")
	public ModelAndView showAllProducts() {
		
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "All Products");
		mv.addObject("categeries",categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value= "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		
		ModelAndView mv = new ModelAndView("Page");
		//categoryDAO tofetch single category
		Category category = null;
		category = categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		mv.addObject("categeries",categoryDAO.list());
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts", true);
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

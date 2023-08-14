package com.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
public class MyController {

	@GetMapping("test")
	public String home2(Model m) {
	
		m.addAttribute("course","java full stack");
		return "home2";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		
	  model.addAttribute("a","100");
		return "home";
		
	}
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model m){
		
		List<String> names=List.of("Ankit","Aparna","Ananya");
		m.addAttribute("names",names);
		
		return"iterate";
	}
	
	
	@GetMapping("/condition")
	public String conditionHandler(Model m)
	{
		System.out.println("Conditional Handler");
		m.addAttribute("isActive",false);
		m.addAttribute("gender","F");

		List<Integer> list=List.of(1,2,3,4,5,6);
		m.addAttribute("myList",list);
		return"condition";
	}
	
	
	
	
	
	
	@SuppressWarnings("deprecation")
	@RequestMapping(method=RequestMethod.GET,value="/about")
	public String about(Model model) {
		model.addAttribute("name", "Keerti");
		model.addAttribute("age", "21");
		model.addAttribute("currentDate", new Date().toLocaleString());
		return"about";
	}
	
	@GetMapping("/alert")
	public String demo() {
		return "add-css-js-demo";
	}
	@GetMapping("/bootstrap")
	public String demo2() {
		return "add-bootstrap";
	}
}

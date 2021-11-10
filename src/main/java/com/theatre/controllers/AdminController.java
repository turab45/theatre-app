package com.theatre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@GetMapping("")
	public String admin(Model model) {
		model.addAttribute("title", "Theatrey - Admin");
		return "admin/dashboard";
	}
	
	@GetMapping("/theatres")
	public String theatres(Model model) {
		model.addAttribute("title", "Admin - Theatres");
		return "admin/theatre";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("title", "Admin - Movies");
		return "admin/movies";
	}
	
	@GetMapping("/actors")
	public String actors(Model model) {
		model.addAttribute("title", "Admin - Actors");
		return "admin/actors";
	}
	
	@GetMapping("/profile")
	public String profile(Model model) {
		model.addAttribute("title", "Admin - Profile");
		return "admin/profile";
	}
}

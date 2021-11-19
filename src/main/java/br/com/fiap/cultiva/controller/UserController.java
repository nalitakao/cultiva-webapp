package br.com.fiap.cultiva.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.cultiva.model.Users;
import br.com.fiap.cultiva.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/cultiva")
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/login/signin")
	public String signin(Users user) {
		return "signin";
	}
	
	@RequestMapping("/login/menu")
	public String menu() {
		return "menu";
	}
	
	@PostMapping("/cultiva")
	public String index(@Valid Users user, BindingResult result) {
		System.out.println(user);
		if (result.hasErrors()) return "signin";
		repository.save(user);
		return "home";
	}

}

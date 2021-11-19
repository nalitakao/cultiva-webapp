package br.com.fiap.cultiva.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.cultiva.model.Harvests;
import br.com.fiap.cultiva.model.SearchHarvests;
import br.com.fiap.cultiva.repository.HarvestRepository;
import br.com.fiap.cultiva.repository.SearchHarvestsRepository;

@Controller
public class HarvestController {
	
	@Autowired
	private HarvestRepository repository;
	
	@Autowired
	private SearchHarvestsRepository repo;
	
	@GetMapping("/harvests")
	public ModelAndView harvests() {
		ModelAndView modelAndView = new ModelAndView("searchharvests");
		List<SearchHarvests> searchharvests = repo.findAll();
		modelAndView.addObject("searchharvests", searchharvests);
		return modelAndView;
	}
	
	@RequestMapping("/harvests/new")
	public String newharvest(Harvests harvest) {
		return "new-harvests";
	}
	
	@PostMapping("/harvests/mine")
	public String myharvests(@Valid Harvests harvests, BindingResult result) {
		System.out.println("salvando..."+harvests);
		if (result.hasErrors()) return "new-harvests";
		repository.save(harvests);
		return "harvests";
	}
	
	@GetMapping("/harvests/mine")
	public ModelAndView myharvests() {
		ModelAndView modelAndView = new ModelAndView("harvests");
		List<Harvests> harvests = repository.findAll();
		modelAndView.addObject("harvests", harvests);
		return modelAndView;
	}
}

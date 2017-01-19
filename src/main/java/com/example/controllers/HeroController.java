package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Herotable;
import com.example.service.HeroService;

@RestController
@CrossOrigin
public class HeroController {
	
	@Autowired
	private HeroService heroService;

	@RequestMapping("/comp")
	public List<Herotable> hello1() {
		return (List<Herotable>) heroService.listAllHero();

	}

	@RequestMapping(value = "body", method = RequestMethod.POST)
	public @ResponseBody List<Herotable> withBody(@RequestBody Herotable body) {
		System.out.println("Posting===" + body.getName());
		System.out.println("Posting===" + body.getRank());
		System.out.println("Posting===" + body.getPower());
		
		heroService.saveHero(body);
		return hello1();
	}
	
	
}

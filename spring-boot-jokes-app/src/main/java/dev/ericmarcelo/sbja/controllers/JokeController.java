package dev.ericmarcelo.sbja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.ericmarcelo.sbja.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;

	@Autowired //Not necessary to add annotation but included for clarity
	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}
	
}

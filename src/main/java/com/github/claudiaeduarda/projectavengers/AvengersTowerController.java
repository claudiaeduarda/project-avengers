package com.github.claudiaeduarda.projectavengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.claudiaeduarda.projectavengers.models.Avengers;
import com.github.claudiaeduarda.projectavengers.models.Movies;
import com.github.claudiaeduarda.projectavengers.repository.AvengersTowerRepository;
import com.github.claudiaeduarda.projectavengers.repository.MoviesTowerRepository;

@Controller
public class AvengersTowerController {
	
	@Autowired
	private AvengersTowerRepository atr;
	private MoviesTowerRepository mtr;

	@RequestMapping(value="/cadastroAvengersTower", method=RequestMethod.GET)
	public String form() {
		return "avengerstower/formAvengersTower";
	}
	
	@RequestMapping(value="/cadastroAvengersTower", method=RequestMethod.POST)
	public String form(Avengers avengers) {
		
		atr.save(avengers);
		
		return "redirect:/cadastroAvengersTower";
	}
	
	@RequestMapping("/avengers")
	public ModelAndView listaAvengers() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Avengers> avengers = atr.findAll();
		mv.addObject("avengers", avengers);
		return mv;
	}
	
	@RequestMapping(value="/cadastroAvengersTowerMovies", method=RequestMethod.GET)
	public String form1() {
		return "avengerstower/formAvengersTowerMovies";
	}
	
	@RequestMapping(value="/cadastroAvengersTowerMovies", method=RequestMethod.POST)
	public String form(Movies movies) {
		
		mtr.save(movies);
		
		return "redirect:/cadastroAvengersTowerMovies";
	}
	
	@RequestMapping("/movies")
	public ModelAndView listaMovies() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Movies> movies = mtr.findAll();
		mv.addObject("movies", movies);
		return mv;
	}
	
}

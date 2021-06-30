package com.github.claudiaeduarda.projectavengers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@GetMapping(value="/cadastroAvengersTower")
	public String getString() {
		return "avengerstower/formAvengersTower";
	}
	
	@GetMapping("/list")
    public List<Avengers> Avengers() {
		return atr.findAll();
	}
	
	@GetMapping
	public Avengers getAvengers(Long id){
        return atr.getById(id);
	}
	
	@GetMapping
	public long countAvengers() {
		long count = atr.count();
		return count;
	}
	
	@PostMapping(value="/cadastroAvengersTower")
	public String postString(Avengers avengers) {
		
		atr.save(avengers);
		
		return "redirect:/cadastroAvengersTower";
	}
	
	@PutMapping(value="/cadastroAvengersTower")
	public String putString() {
		return "avengerstower/formAvengersTower";
	}
	
	@DeleteMapping(value="/cadastroAvengersTower")
	public String deleteString() {
		return "avengerstower/formAvengersTower";
	}
	
	@RequestMapping("/avengers")
	public ModelAndView listaAvengers() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Avengers> avengers = atr.findAll();
		mv.addObject("avengers", avengers);
		return mv;
	}
	
	@GetMapping(value="/cadastroAvengersTowerMovies")
	public String getString1() {
		return "moviestower/formAvengersTowerMovies";
	}
	
	@GetMapping("/list")
    public List <Movies> Movies() {
		return mtr.findAll();
	}
	
	@GetMapping
	public Movies getMovies(Long id){
        return mtr.getById(id);
    }
	
	@GetMapping
	public long countMovies() {
		long count = mtr.count();
		return count;
	}
	
	@PostMapping(value="/cadastroAvengersTowerMovies")
	public String postString(Movies movies) {
		
		mtr.save(movies);
		
		return "redirect:/cadastroAvengersTowerMovies";
	}
	
	@PutMapping(value="/cadastroAvengersTowerMovies")
	public String putString1() {
		return "moviestower/formAvengersTowerMovies";
	}
	
	@DeleteMapping(value="/cadastroAvengersTowerMovies")
	public String deleteString1() {
		return "moviestower/formAvengersTowerMovies";
	}
	
	@RequestMapping("/movies")
	public ModelAndView listaMovies() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Movies> movies = mtr.findAll();
		mv.addObject("movies", movies);
		return mv;
	}
	
}

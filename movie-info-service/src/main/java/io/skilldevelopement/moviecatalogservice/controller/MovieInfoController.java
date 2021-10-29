package io.skilldevelopement.moviecatalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skilldevelopement.moviecatalogservice.model.Movie;

@RestController
@RequestMapping("/movies")

public class MovieInfoController {
	
	@GetMapping("/{movieid}")
	public Movie getmovieinfo(@PathVariable("movieid") String movieid)
	{
		return new Movie(movieid,"test name Aarnna");
	}

}

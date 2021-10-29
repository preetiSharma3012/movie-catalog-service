package io.skilldevelopement.moviecatalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skilldevelopement.moviecatalogservice.model.Rating;

@RestController
@RequestMapping("/ratings")
public class RatingsControllerClass {
	
	@GetMapping("/{movieid}")
	public Rating getRating(@PathVariable("movieid") String movieid)
	{
		return new Rating(movieid,5);
		
	}

}

package io.skilldevelopement.moviecatalogservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skilldevelopement.moviecatalogservice.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@GetMapping("/{userid}")
	public List<CatalogItem> getcatalog(@PathVariable("userid") String userid)
	{
		return Collections.singletonList(new CatalogItem("Lagan","Bollywood Movie",4 ));
		
	}
}

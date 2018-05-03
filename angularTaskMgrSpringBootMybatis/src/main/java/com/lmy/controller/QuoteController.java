package com.lmy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmy.pojo.Quote;
import com.lmy.service.QuoteService;

@RestController
@RequestMapping("/api")
public class QuoteController {
	
	@Autowired
	QuoteService quoteService;
	
	@GetMapping("/quotes")
	public List<Quote> getQuotes(){
		return quoteService.getQuotes();
	}
	
	@GetMapping("/quote")
	public Quote getRandomQuote(){
		return quoteService.getRandomQuote();
	}
	
}

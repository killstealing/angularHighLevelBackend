package com.lmy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmy.mapper.QuoteMapper;
import com.lmy.pojo.Quote;

@Service
public class QuoteService {

	@Autowired
	QuoteMapper quoteMapper;

	public List<Quote> getQuotes(){
		return quoteMapper.getQuotes();
	}
	
	public Quote getRandomQuote(){
		return quoteMapper.getRandomQuote();
	}
}

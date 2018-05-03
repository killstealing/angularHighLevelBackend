package com.lmy.mapper;

import java.util.List;

import com.lmy.pojo.Quote;

public interface QuoteMapper {
	public List<Quote> getQuotes();
	
	public Quote getRandomQuote();
}

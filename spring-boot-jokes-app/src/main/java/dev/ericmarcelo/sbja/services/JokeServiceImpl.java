package dev.ericmarcelo.sbja.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	

	public JokeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}



	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return this.chuckNorrisQuotes.getRandomQuote();
	}

}

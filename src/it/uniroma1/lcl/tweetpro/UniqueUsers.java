package it.uniroma1.lcl.tweetpro;

import java.util.ArrayList;

public interface UniqueUsers 
{
	/**
	 * @param ArrayList<Tweets> listaTweet
	 * @return int of unique users in listaTweet
	 */
	public int calculate(ArrayList<Tweet> listaTweet);

}

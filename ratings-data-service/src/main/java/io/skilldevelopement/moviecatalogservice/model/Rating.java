package io.skilldevelopement.moviecatalogservice.model;

public class Rating {
	
	private String movieid;
	private int ratings;
	
	
	public Rating(String movieid, int ratings) {
		super();
		this.movieid = movieid;
		this.ratings = ratings;
	}
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	
	
}

package com.spring.model;

public class MovieTo {
	private int movieId;
	private String movieName;
	private float ratings;


	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}

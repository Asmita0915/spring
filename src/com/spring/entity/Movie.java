package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="movies")
public class Movie {

	@Id
	@Column(name="id")
	private int movieId;
	@Column(name="movie_name")
	private String movieName;
	@Column(name="ratings")
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

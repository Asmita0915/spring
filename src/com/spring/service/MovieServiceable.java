package com.spring.service;

import java.util.List;

import com.spring.model.MovieTo;

public interface MovieServiceable {
	public List<MovieTo> getMovieNames();
	public String getSuccess();
}

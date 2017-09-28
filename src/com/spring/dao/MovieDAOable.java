package com.spring.dao;

import java.util.List;

import com.spring.model.MovieTo;

public interface MovieDAOable {

	public List<MovieTo> getMovieNames();
	public String getSuccess();
}

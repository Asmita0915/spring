package com.spring.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.dao.MovieDAOable;
import com.spring.model.MovieTo;

@Service
public class MovieService implements MovieServiceable {

	@Autowired
	MovieDAOable dao;
	
	@Override
	@Transactional
	public List<MovieTo> getMovieNames() {//returning list of movies to controller
		// TODO Auto-generated method stub
		List<MovieTo> movie=dao.getMovieNames();//calling dao class
		return movie;
	}

	@Override
	public String getSuccess() {
		// TODO Auto-generated method stub
		return dao.getSuccess();
	}

}

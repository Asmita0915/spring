package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Movie;
import com.spring.model.MovieTo;

@Repository
public class MovieDAO implements MovieDAOable{

	@Autowired
	SessionFactory session; //autowiring session object for hibernate
	
	@Override
	public List<MovieTo> getMovieNames() {//getting data from mysqlthrough hibernate
		List<Movie> listMovie=session.getCurrentSession().createQuery("from Movie m").list();
		List<MovieTo> listToService=new ArrayList<MovieTo>();
		for (Movie movie : listMovie) {// converting entity to model
			MovieTo movieTo=new MovieTo();
			movieTo.setMovieId(movie.getMovieId());
			movieTo.setMovieName(movie.getMovieName());
			movieTo.setRatings(movie.getRatings());
			listToService.add(movieTo);//adding movie object to list
		}
		return listToService;
	}

	@Override	
	public String getSuccess() {
		// TODO Auto-generated method stub
		return "Sucess from DAO";
	}

}

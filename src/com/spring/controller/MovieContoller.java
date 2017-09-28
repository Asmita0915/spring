package com.spring.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.spring.model.MovieTo;
import com.spring.service.MovieServiceable;

@RestController
@RequestMapping("/movies")// mapping class 
public class MovieContoller {

	@Autowired
	MovieServiceable movieService;	
	
	@RequestMapping(value="/success",method=RequestMethod.GET)//test link
	public String getSuccess(){
	return	movieService.getSuccess();
	}
	
	@RequestMapping(value="/getMovies",method=RequestMethod.GET)// get movies
	public String getMovieNames(){
		List<MovieTo> movie=movieService.getMovieNames();//call service method
		JSONObject jsonMovieObj= getJSObject(movie);//get JSON Object of data
	return	jsonMovieObj.toJSONString();
	}
	
	public JSONObject getJSObject(List<MovieTo> movie){//creating jsonobject
		JSONObject jsonMovieObj=new JSONObject();
		JSONArray jsonMovieArray=new JSONArray();
		for (MovieTo movieTo : movie) {
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("id", movieTo.getMovieId());
			jsonObj.put("name", movieTo.getMovieName());
			jsonObj.put("ratings", movieTo.getRatings());
			System.out.println(jsonObj);
			jsonMovieArray.add(jsonObj);			
		}
		jsonMovieObj.put("movies", jsonMovieArray);
		System.out.println(jsonMovieObj);
		return jsonMovieObj;
	}
}

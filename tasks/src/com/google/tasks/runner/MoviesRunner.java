package com.google.tasks.runner;

import com.google.tasks.service.KannadaMovies;
import com.google.tasks.service.MovieReviews;
import com.google.tasks.service.MovieDetails;
public class MoviesRunner {

	public static void main(String[] args) {
		
		KannadaMovies kannada=new KannadaMovies();
		MovieDetails movie=new MovieDetails();
		MovieReviews reviews=new MovieReviews();

		kannada.moviesinfo("Google","kannada",870);
		kannada.Kannadadetails("very nice movie");
		
		movie.moviesinfo("Arasu", "kannada", 450);
		movie.moviebudget(7500);
		
		reviews.moviesinfo("SeethaRama","Telugu" , 700);
		reviews.movieratings(6.5);
		
		
	}

}

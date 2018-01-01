package xyz.hsuyeemon.movies.data.models;

import xyz.hsuyeemon.movies.network.MovieDataAgent;

/**
 * Created by Dell on 12/29/2017.
 */

public class MovieModel {

    private static MovieModel sMovieModel;

    private MovieDataAgent mMovieDataAgent;

    private MovieModel(){

    }

    public static MovieModel getObjInstance(){
        if(sMovieModel==null){
            sMovieModel=new MovieModel();
        }
        return sMovieModel;
    }

}

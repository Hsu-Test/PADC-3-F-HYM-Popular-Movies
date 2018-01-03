package xyz.hsuyeemon.movies.data.models;

import xyz.hsuyeemon.movies.network.HttpUrlConnectionDataAgent;
import xyz.hsuyeemon.movies.network.MovieDataAgent;

/**
 * Created by Dell on 12/29/2017.
 */

public class MovieModel {

    private static MovieModel sMovieModel;

    private MovieDataAgent mMovieDataAgent;

    private MovieModel() {

        mMovieDataAgent = HttpUrlConnectionDataAgent.getObjInstance();
    }

    public static MovieModel getObjInstance() {
        if (sMovieModel == null) {
            sMovieModel = new MovieModel();
        }
        return sMovieModel;
    }

    /**
     * loads news from Network layer
     */
    public void loadNews() {

        mMovieDataAgent.loadMovie();

    }

}

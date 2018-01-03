package xyz.hsuyeemon.movies.events;

import java.util.List;

import xyz.hsuyeemon.movies.data.vo.PopularMovieVO;

/**
 * Created by Dell on 1/1/2018.
 */

public class LoadedMoviesEvent {

    private List<PopularMovieVO> movieList;

    public LoadedMoviesEvent(List<PopularMovieVO> movieList) {
        this.movieList = movieList;
    }

    public List<PopularMovieVO> getMovieList() {
        return movieList;
    }
}

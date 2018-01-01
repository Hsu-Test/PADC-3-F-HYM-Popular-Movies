package xyz.hsuyeemon.movies.network.responses;

import java.util.List;

import xyz.hsuyeemon.movies.data.vo.MovieVO;

/**
 * Created by Dell on 1/1/2018.
 */

public class GetMovieResponse {

    private int code;
    private String message;
    private String apiVersion;
    private int page;
    private List<MovieVO> movies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public int getPage() {
        return page;
    }

    public List<MovieVO> getMovies() {
        return movies;
    }
}

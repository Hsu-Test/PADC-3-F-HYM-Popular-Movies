package xyz.hsuyeemon.movies.network.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import xyz.hsuyeemon.movies.data.vo.PopularMovieVO;

/**
 * Created by Dell on 1/1/2018.
 */

public class GetMovieResponse {

    private int code;
    private String message;
    private String apiVersion;
    private int page;

    @SerializedName("popular-movies")
    private List<PopularMovieVO> movies;

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

    public List<PopularMovieVO> getMovies() {
        return movies;
    }
}

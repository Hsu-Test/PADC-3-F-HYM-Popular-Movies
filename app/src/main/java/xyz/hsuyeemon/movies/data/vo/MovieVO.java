package xyz.hsuyeemon.movies.data.vo;

import java.util.List;

/**
 * Created by Dell on 12/20/2017.
 */

public class MovieVO {

    private int codes;
    private String messages;
    private String apiVersions;
    private int pages;
    private List<PopularMovieVO> popularMovies;

    public int getCodes() {
        return codes;
    }

    public String getMessages() {
        return messages;
    }

    public String getApiVersions() {
        return apiVersions;
    }

    public int getPages() {
        return pages;
    }

    public List<PopularMovieVO> getPopularMovies() {
        return popularMovies;
    }
}

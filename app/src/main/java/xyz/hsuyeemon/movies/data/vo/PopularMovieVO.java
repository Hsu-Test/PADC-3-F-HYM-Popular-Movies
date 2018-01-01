package xyz.hsuyeemon.movies.data.vo;

import java.util.List;

/**
 * Created by Dell on 12/20/2017.
 */

public class PopularMovieVO {

    private int voteCount;
    private int id;
    private boolean video;
    private float voteAverage;
    private String title;
    private float popularity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private List<Integer> genreId;
    private String backdropPath;
    private boolean adult;
    private String overview;
    private String releaseDate;

    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return id;
    }

    public boolean isVideo() {
        return video;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public float getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public List<Integer> getGenreId() {
        return genreId;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}

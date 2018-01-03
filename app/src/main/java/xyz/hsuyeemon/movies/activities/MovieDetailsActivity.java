package xyz.hsuyeemon.movies.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.hsuyeemon.movies.R;
import xyz.hsuyeemon.movies.adapters.MovieGenreAdapter;
import xyz.hsuyeemon.movies.adapters.MovieReviewAdapter;
import xyz.hsuyeemon.movies.adapters.MovieTrailerAdapter;

/**
 * Created by Dell on 12/12/2017.
 */

public class MovieDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_movies_details)
    RecyclerView rvMoviesDetails;

    @BindView(R.id.rv_movies_genre)
    RecyclerView rvMoviesGenre;

    @BindView(R.id.rv_movies_reviews)
    RecyclerView rvMoviesReviews;

    private MovieTrailerAdapter mMovieDetailsAdapter;
    private MovieGenreAdapter mMovieGenreAdapter;
    private MovieReviewAdapter mMovieReviewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        ButterKnife.bind(this, this);

        mMovieDetailsAdapter = new MovieTrailerAdapter();
        LinearLayoutManager movieDetailsLinearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvMoviesDetails.setLayoutManager(movieDetailsLinearLayoutManager);
        rvMoviesDetails.setAdapter(mMovieDetailsAdapter);

        mMovieGenreAdapter = new MovieGenreAdapter();
        LinearLayoutManager movieGenreLinearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvMoviesGenre.setLayoutManager(movieGenreLinearLayoutManager);
        rvMoviesGenre.setAdapter(mMovieGenreAdapter);

        mMovieReviewAdapter = new MovieReviewAdapter();
        LinearLayoutManager movieReviewLinearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvMoviesReviews.setLayoutManager(movieReviewLinearLayoutManager);
        rvMoviesReviews.setAdapter(mMovieReviewAdapter);

    }
}

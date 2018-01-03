package xyz.hsuyeemon.movies.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.hsuyeemon.movies.R;
import xyz.hsuyeemon.movies.data.vo.PopularMovieVO;
import xyz.hsuyeemon.movies.delegates.MovieItemActionDelegates;

/**
 * Created by Dell on 12/8/2017.
 */

public class ItemMovieViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_average_rating)
    TextView tvAverageRating;

    @BindView(R.id.iv_dummy_movie)
    ImageView ivDummyMovie;

    @BindView(R.id.tv_movie_title)
    TextView tvMovieTitle;

    MovieItemActionDelegates mMovieItemActionDelegates;

    public ItemMovieViewHolder(View itemView, MovieItemActionDelegates movieItemActionDelegates) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mMovieItemActionDelegates = movieItemActionDelegates;
    }

    @OnClick(R.id.cv_movie_item_root)
    public void onTapMovieItem(View view) {
        //Toast.makeText(view.getContext(), "Movie item tapped", Toast.LENGTH_SHORT).show();
        mMovieItemActionDelegates.onTapMovieItem();
    }

    public void setMovies(PopularMovieVO movie) {

        tvAverageRating.setText(String.valueOf(movie.getVoteAverage()));
        tvMovieTitle.setText(movie.getTitle());

        Glide.with(ivDummyMovie.getContext()).
                load(movie.getPosterPath())
                .into(ivDummyMovie);

    }
}

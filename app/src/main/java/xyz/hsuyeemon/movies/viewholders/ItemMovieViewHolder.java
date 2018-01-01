package xyz.hsuyeemon.movies.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.hsuyeemon.movies.R;
import xyz.hsuyeemon.movies.delegates.MovieItemActionDelegates;

/**
 * Created by Dell on 12/8/2017.
 */

public class ItemMovieViewHolder extends RecyclerView.ViewHolder {
    MovieItemActionDelegates mMovieItemActionDelegates;
    public ItemMovieViewHolder(View itemView, MovieItemActionDelegates movieItemActionDelegates) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mMovieItemActionDelegates=movieItemActionDelegates;
    }
    @OnClick(R.id.cv_movie_item_root)
    public void onTapMovieItem(View view){
        //Toast.makeText(view.getContext(), "Movie item tapped", Toast.LENGTH_SHORT).show();
        mMovieItemActionDelegates.onTapMovieItem();
    }
}

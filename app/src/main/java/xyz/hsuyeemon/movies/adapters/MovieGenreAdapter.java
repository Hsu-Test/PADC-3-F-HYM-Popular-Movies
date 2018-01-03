package xyz.hsuyeemon.movies.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.hsuyeemon.movies.R;
import xyz.hsuyeemon.movies.viewholders.ItemMovieGenreViewHolder;

/**
 * Created by Dell on 12/16/2017.
 */

public class MovieGenreAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieGenreViewHolder = inflater.inflate(R.layout.item_movie_genre, parent, false);
        ItemMovieGenreViewHolder itemMovieGenreViewHolder = new ItemMovieGenreViewHolder(movieGenreViewHolder);
        return itemMovieGenreViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

package xyz.hsuyeemon.movies.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.hsuyeemon.movies.R;
import xyz.hsuyeemon.movies.viewholders.ItemMovieTrailerViewHolder;

/**
 * Created by Dell on 12/14/2017.
 */

public class MovieTrailerAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieTrailerViewHolder = inflater.inflate(R.layout.item_movie_trailer, parent, false);
        ItemMovieTrailerViewHolder itemMovieTrailerViewHolder = new ItemMovieTrailerViewHolder(movieTrailerViewHolder);
        return itemMovieTrailerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}

package xyz.hsuyeemon.movies.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.hsuyeemon.movies.R;
import xyz.hsuyeemon.movies.viewholders.ItemMovieReviewViewHolder;

/**
 * Created by Dell on 12/17/2017.
 */

public class MovieReviewAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View movieReviewViewHolder=inflater.inflate(R.layout.item_movie_review,parent,false);
        ItemMovieReviewViewHolder itemMovieReviewViewHolder=new ItemMovieReviewViewHolder(movieReviewViewHolder);
        return itemMovieReviewViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

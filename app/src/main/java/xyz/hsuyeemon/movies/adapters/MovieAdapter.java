package xyz.hsuyeemon.movies.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.hsuyeemon.movies.R;
import xyz.hsuyeemon.movies.delegates.MovieItemActionDelegates;
import xyz.hsuyeemon.movies.viewholders.ItemMovieViewHolder;

/**
 * Created by Dell on 12/8/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter {
    MovieItemActionDelegates mMovieItemActionDelegates;
    public MovieAdapter(MovieItemActionDelegates movieItemActionDelegates){
        mMovieItemActionDelegates=movieItemActionDelegates;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View movieViewHolder=inflater.inflate(R.layout.item_movie,parent,false);
        ItemMovieViewHolder itemMovieViewHolder=new ItemMovieViewHolder(movieViewHolder,mMovieItemActionDelegates);
        return itemMovieViewHolder;

        }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}

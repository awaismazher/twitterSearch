package assignment.vendawais.twittersearchapi.search.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import assignment.vendawais.twittersearchapi.BR;
import assignment.vendawais.twittersearchapi.R;
import assignment.vendawais.twittersearchapi.databinding.TweetItemBinding;
import assignment.vendawais.twittersearchapi.search.holder.TweetViewHolder;
import assignment.vendawais.twittersearchapi.search.model.Status;

/**
 * Created by syed.awais.mazhar on 2/9/2018.
 */

public class TweetsAdapter extends RecyclerView.Adapter<TweetViewHolder> {
    List<Status> statuses;
    ItemClickListener itemClickListener;

    public TweetsAdapter() {
        statuses = Collections.emptyList();
    }

    @Override
    public TweetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        TweetItemBinding tweetItemBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.tweet_item, parent, false);
        tweetItemBinding.setVariable(BR.itemClickListener,itemClickListener);
        return new TweetViewHolder(tweetItemBinding);
    }

    @Override
    public void onBindViewHolder(TweetViewHolder holder,  int position) {
        holder.bind(statuses.get(holder.getAdapterPosition()));

    }

    @Override
    public int getItemCount() {
        return statuses.size();
    }

    public void setTweetsStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(Status status);
    }
}

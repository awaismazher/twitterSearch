package assignment.vendawais.twittersearchapi.search.holder;

import android.support.v7.widget.RecyclerView;
import android.databinding.ViewDataBinding;
import assignment.vendawais.twittersearchapi.BR;
import assignment.vendawais.twittersearchapi.search.model.Status;

/**
 * Created by syed.awais.mazhar on 1/9/2018.
 */

public class TweetViewHolder extends RecyclerView.ViewHolder {
    private final ViewDataBinding itemBinding;

    public TweetViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.itemBinding = binding;
    }

    public void bind(Status status) {
        itemBinding.setVariable(BR.brTweet, status);
        itemBinding.executePendingBindings();
    }

}
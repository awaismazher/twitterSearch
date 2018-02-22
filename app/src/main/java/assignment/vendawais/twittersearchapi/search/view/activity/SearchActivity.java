package assignment.vendawais.twittersearchapi.search.view.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import assignment.vendawais.twittersearchapi.BR;
import assignment.vendawais.twittersearchapi.R;
import assignment.vendawais.twittersearchapi.databinding.ActivitySearchBinding;
import assignment.vendawais.twittersearchapi.di.component.DaggerTweetComponent;
import assignment.vendawais.twittersearchapi.search.adapter.TweetsAdapter;
import assignment.vendawais.twittersearchapi.search.model.SearchTweet;
import assignment.vendawais.twittersearchapi.search.model.Status;
import assignment.vendawais.twittersearchapi.util.Constants;
import assignment.vendawais.twittersearchapi.common.BaseActivity;
import assignment.vendawais.twittersearchapi.di.component.AppComponent;
import assignment.vendawais.twittersearchapi.di.module.NetModule;
import assignment.vendawais.twittersearchapi.di.module.TweetsModule;
import assignment.vendawais.twittersearchapi.search.view.presenter.Presenter;
import assignment.vendawais.twittersearchapi.search.view.presenter.TweetsPresenter;
import assignment.vendawais.twittersearchapi.util.EndPoints;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by syed.awais.mazhar on 2/7/2018.
 */

public class SearchActivity extends BaseActivity implements TweetsPresenter.View,
        TweetsAdapter.ItemClickListener {
    @Inject
    Presenter presenter;
    @Inject
    RecyclerView.LayoutManager layoutManager;
    @Inject
    TweetsAdapter tweetsAdapter;
    @Inject
    SearchTweet searchTweet;
    private ActivitySearchBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(
                this, R.layout.activity_search);
        binding.setVariable(BR.search, searchTweet);

        binding.executePendingBindings();
        ButterKnife.bind(this);
        presenter.fetchTweets(Constants.INSTANCE.getLAHORE());//Fetch Lahore's tweets in start
    }


    @Override
    protected void setupComponent(AppComponent appComponent) {
        DaggerTweetComponent.builder()
                .appComponent(appComponent)
                .netModule(new NetModule(EndPoints.INSTANCE.getBASE_URL()))
                .tweetsModule(new TweetsModule(this, this))
                .build()
                .inject(this);
    }

    public void onSearchClicked(View v) {
        presenter.fetchTweets(searchTweet.getQuery().isEmpty() ?
                Constants.INSTANCE.getLAHORE():searchTweet.getQuery());
    }

    @Override
    public void showProgress() {
        binding.pbLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        binding.pbLoading.setVisibility(View.INVISIBLE);
    }

    @Override
    public void loadStatuses(List<Status> statuses) {
        if (statuses == null) {
            showMessage(getString(R.string.no_tweets_avaialable));
        }
        tweetsAdapter.setTweetsStatuses(statuses);
        tweetsAdapter.setItemClickListener(this);
        initRecyclerView();
        binding.tweets.setAdapter(tweetsAdapter);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemClick(Status status) {
        presenter.onTweetClicked(status);
    }

    private void initRecyclerView() {
        binding.tweets.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(binding.tweets.getContext(), DividerItemDecoration.VERTICAL);
        binding.tweets.addItemDecoration(dividerItemDecoration);
    }
}

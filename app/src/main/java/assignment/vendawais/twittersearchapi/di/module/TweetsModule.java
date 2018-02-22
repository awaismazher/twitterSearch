package assignment.vendawais.twittersearchapi.di.module;


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import assignment.vendawais.twittersearchapi.search.adapter.TweetsAdapter;
import assignment.vendawais.twittersearchapi.search.model.SearchTweet;
import assignment.vendawais.twittersearchapi.search.view.presenter.Presenter;
import assignment.vendawais.twittersearchapi.search.view.presenter.TweetsPresenter;
import dagger.Module;
import dagger.Provides;

@Module
public class TweetsModule {
    private TweetsPresenter.View view;
    private Context context;

    public TweetsModule(TweetsPresenter.View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Provides
    public TweetsPresenter.View provideView() {
        return view;
    }

    @Provides
    public Presenter providePresenter(TweetsPresenter tweetsPresenter) {
        return tweetsPresenter;
    }

    @Provides
    public RecyclerView.LayoutManager provideLayoutManager() {
        return new LinearLayoutManager(context);
    }

    @Provides
    public TweetsAdapter provideTweetsAdapter() {
        return new TweetsAdapter();
    }

    @Provides
    public SearchTweet provideSearchTweet() {
        return new SearchTweet();
    }
}

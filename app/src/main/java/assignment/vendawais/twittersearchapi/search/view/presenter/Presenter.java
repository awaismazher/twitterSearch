package assignment.vendawais.twittersearchapi.search.view.presenter;

import assignment.vendawais.twittersearchapi.search.model.Status;
import assignment.vendawais.twittersearchapi.search.model.Tweets;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by syed.awais.mazhar on 2/7/2018.
 */

public interface Presenter {
    void fetchTweets(String query);
    void setView(TweetsPresenter.View view);
    void onTweetClicked(Status status);
    default void subscribe(Observable<Tweets> observable, Observer<Tweets> observer) {
        observable.subscribeOn(Schedulers.newThread())
                .toSingle()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}

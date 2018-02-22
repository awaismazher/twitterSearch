package assignment.vendawais.twittersearchapi.search.view.presenter;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import javax.inject.Inject;

import assignment.vendawais.twittersearchapi.api.TweetsGateway;
import assignment.vendawais.twittersearchapi.search.model.Status;
import assignment.vendawais.twittersearchapi.search.model.Tweets;
import assignment.vendawais.twittersearchapi.util.Constants;
import rx.Observable;
import rx.Observer;

/**
 * Created by syed.awais.mazhar on 2/7/2018.
 */

public class TweetsPresenter implements Presenter, Observer<Tweets> {
    @Inject
    TweetsGateway tweetsGateway;
    @Inject
    View view;

    @Inject
    public TweetsPresenter() {

    }

    @Override
    public void fetchTweets(String query) {
        view.showProgress();
        Observable<Tweets> getTweets = tweetsGateway.getTweets(query, Constants.INSTANCE.getCOUNT());
        subscribe(getTweets, this);
    }

    @Override
    public void setView(@NotNull View view) {

    }

    @Override
    public void onTweetClicked(Status status) {
        view.showMessage(status.getText());
    }

    @Override
    public void onCompleted() {
        view.hideProgress();
    }

    @Override
    public void onError(Throwable e) {
        view.hideProgress();
        view.showMessage(e.getMessage());
    }

    @Override
    public void onNext(Tweets tweets) {
        view.loadStatuses(tweets.getStatuses());
    }

    public interface View {
        void showProgress();

        void hideProgress();

        void loadStatuses(List<Status> statuses);

        void showMessage(String message);
    }
}

package assignment.vendawais.twittersearchapi.di.component;

import assignment.vendawais.twittersearchapi.di.module.NetModule;
import assignment.vendawais.twittersearchapi.di.module.TweetsModule;
import assignment.vendawais.twittersearchapi.di.scope.ActivityScope;
import assignment.vendawais.twittersearchapi.search.view.activity.MainActivity;
import assignment.vendawais.twittersearchapi.search.view.activity.SearchActivity;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = {TweetsModule.class, NetModule.class})
public interface TweetComponent {
  //void inject(MainActivity mainActivity);
  void inject(SearchActivity searchActivity);

}

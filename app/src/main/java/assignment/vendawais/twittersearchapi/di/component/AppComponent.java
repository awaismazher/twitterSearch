package assignment.vendawais.twittersearchapi.di.component;

import javax.inject.Singleton;

import assignment.vendawais.twittersearchapi.application.TwitterSearchApplication;
import assignment.vendawais.twittersearchapi.di.module.AppModule;
import dagger.Component;

@Singleton @Component(modules = {
    AppModule.class
}) public interface AppComponent {
  void inject(TwitterSearchApplication twitterSearchApplication);

  //Movies getFindItemsInteractor();
}

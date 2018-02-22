package assignment.vendawais.twittersearchapi.di.module;

import android.app.Application;

import javax.inject.Singleton;

import assignment.vendawais.twittersearchapi.application.TwitterSearchApplication;
import dagger.Module;
import dagger.Provides;

@Module public class AppModule {

  private TwitterSearchApplication twitterSearchApplication;

  public AppModule(TwitterSearchApplication twitterSearchApplication) {
    this.twitterSearchApplication = twitterSearchApplication;
  }

  @Provides @Singleton public Application provideApplication() {
    return twitterSearchApplication;
  }
}

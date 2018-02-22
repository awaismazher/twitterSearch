package assignment.vendawais.twittersearchapi.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import assignment.vendawais.twittersearchapi.application.TwitterSearchApplication;
import assignment.vendawais.twittersearchapi.di.component.AppComponent;

/**
 * Created by syed.awais.mazhar on 1/8/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setupComponent(((TwitterSearchApplication) this.getApplicationContext()).component());
  }

  protected abstract void setupComponent(AppComponent appComponent);
}

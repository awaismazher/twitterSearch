package assignment.vendawais.twittersearchapi.application;

import android.app.Application;

import assignment.vendawais.twittersearchapi.di.component.AppComponent;
import assignment.vendawais.twittersearchapi.di.component.DaggerAppComponent;


/**
 * Created by syed.awais.mazhar on 2/7/2018.
 */

public class TwitterSearchApplication extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        setupAppComponent();
    }

    private void setupAppComponent() {
        component = DaggerAppComponent.builder().build();
        component.inject(this);
    }

    public  AppComponent component() {
        return component;
    }
}

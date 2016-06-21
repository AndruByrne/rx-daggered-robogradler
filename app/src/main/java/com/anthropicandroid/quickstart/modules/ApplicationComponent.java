package com.anthropicandroid.quickstart.modules;

import android.app.Application;

import com.anthropicandroid.quickstart.activity.UserActionHandlers;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;
import rx.Observable;

/*
 * Created by Andrew Brin on 3/1/2016.
 */

@Singleton //  Singleton is the annotation for the Application scope
@Component(modules = {
        AppModule.class,
        ThreadingModule.class,
        FirstObservableModule.class,
        UserActionHandlersModule.class })
public interface ApplicationComponent {

    Application getContext();

    UserActionHandlers getUserActionHandlers();

    @Named("firstObs")
    Observable<Integer> getFirstobs();

}

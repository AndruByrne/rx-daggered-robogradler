package com.anthropicandroid.quickstart.modules;

import android.app.Application;

import com.anthropicandroid.quickstart.activity.UserActionHandlers;

import javax.inject.Singleton;

import dagger.Component;

/*
 * Created by Andrew Brin on 3/1/2016.
 */

@Singleton //  Singleton is the annotation for the Application scope
@Component(modules = {
        AppModule.class,
        ThreadingModule.class,
        UserActionHandlersModule.class })
public interface ApplicationComponent {

    Application getContext();

    UserActionHandlers getUserActionHandlers();

}

package com.anthropicandroid.quickstart.modules;

/*
 * Created by Andrew Brin on 3/3/2016.
 */

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Application application;

    public AppModule(Application application){ this.application = application; }

    @Provides
    @Singleton
    Application providesApplication(){
        return application;
    }
}

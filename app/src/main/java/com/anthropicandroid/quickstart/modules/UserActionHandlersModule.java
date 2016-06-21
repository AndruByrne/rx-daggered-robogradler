package com.anthropicandroid.quickstart.modules;

/*
 * Created by Andrew Brin on 6/21/2016.
 */

import com.anthropicandroid.quickstart.activity.UserActionHandlers;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserActionHandlersModule {
    @Provides
    @Singleton
    UserActionHandlers getUserActionHandlers(){
        return new UserActionHandlers();
    }
}

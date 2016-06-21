package com.anthropicandroid.quickstart.modules;

/*
 * Created by Andrew Brin on 5/24/2016.
 */

import com.anthropicandroid.quickstart.activity.QuickStartActivityTest;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                ThreadingModule.class,
                FirstObservableModule.class,
                UserActionHandlersModule.class
        })
public interface QuickStartTestComponent extends ApplicationComponent {
    void inject(QuickStartActivityTest quickStartActivityTest);
}

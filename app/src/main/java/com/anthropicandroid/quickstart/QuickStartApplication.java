package com.anthropicandroid.quickstart;

import android.app.Application;

import com.anthropicandroid.quickstart.modules.AppModule;
import com.anthropicandroid.quickstart.modules.ApplicationComponent;
import com.anthropicandroid.quickstart.modules.DaggerApplicationComponent;
import com.anthropicandroid.quickstart.modules.DaggerQuickStartAdapterComponent;
import com.anthropicandroid.quickstart.modules.QuickStartAdapterComponent;
import com.anthropicandroid.quickstart.modules.ThreadingModule;
import com.anthropicandroid.quickstart.modules.UserActionHandlersModule;


public class QuickStartApplication extends Application {
    private ApplicationComponent applicationComponent;
    public static String TAG = QuickStartApplication.class.getSimpleName();
    private static QuickStartApplication instance;
    private QuickStartAdapterComponent quickStartAdapterComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        applicationComponent = DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .threadingModule(getThreadingModule()) //  getting for overriding with mocks in testing
                .userActionHandlersModule(new UserActionHandlersModule())
                .build();
    }

    public QuickStartAdapterComponent createQuickStartAdapterComponent() {
        if (quickStartAdapterComponent == null)
            quickStartAdapterComponent = DaggerQuickStartAdapterComponent
                    .builder()
                    .applicationComponent(applicationComponent)
                    .build();
        return quickStartAdapterComponent;
    }

    public static QuickStartApplication getInstance() {
        return instance;
    }

    public ThreadingModule getThreadingModule() {
        return new ThreadingModule();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public void releaseQuickStartAdapterComponent() {
        quickStartAdapterComponent = null;
    }
}

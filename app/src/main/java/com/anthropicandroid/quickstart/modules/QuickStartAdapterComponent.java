package com.anthropicandroid.quickstart.modules;

/*
 * Created by Andrew Brin on 6/21/2016.
 */

import com.anthropicandroid.quickstart.activity.QuickStartActivity;

import dagger.Component;

@QuickStartScope
@Component(dependencies = ApplicationComponent.class)
public interface QuickStartAdapterComponent extends android.databinding.DataBindingComponent{

//    UserActionHandlers getUserActionHandlers();
//
    void inject(QuickStartActivity quickStartActivity);
}

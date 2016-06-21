package com.anthropicandroid.quickstart.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.view.View;

import com.anthropicandroid.quickstart.QuickStartApplication;
import com.anthropicandroid.quickstart.databinding.QuickStartActivityBinding;
import com.anthropicandroid.quickstart.modules.QuickStartAdapterComponent;

/*
 * Created by Andrew Brin on 4/6/2016.
 */
final public class UserActionHandlers {

    public static final String TAG = UserActionHandlers.class.getSimpleName();

    public void showStats(View view){
        Activity context = (Activity) view.getContext();
        QuickStartApplication application = (QuickStartApplication) context.getApplication();
        QuickStartActivityBinding activityBinding = DataBindingUtil.findBinding(view);
        QuickStartAdapterComponent settingsAdapterComponent = application.createQuickStartAdapterComponent();
    }

    public void showInventory(View view){
    }

    public void showMap(View view){
    }

    public boolean backPressedConsumed() {
        return false;
//        ((QuickStartApplication) ((Activity) view.getContext()).getApplication()).releaseMapComponent();  //  unaccounted for
    }
}

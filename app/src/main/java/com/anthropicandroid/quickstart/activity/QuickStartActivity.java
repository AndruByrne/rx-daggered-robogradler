package com.anthropicandroid.quickstart.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.anthropicandroid.quickstart.QuickStartApplication;
import com.anthropicandroid.quickstart.R;
import com.anthropicandroid.quickstart.databinding.QuickStartActivityBinding;
import com.anthropicandroid.quickstart.modules.QuickStartAdapterComponent;

import javax.inject.Inject;

final public class QuickStartActivity extends Activity {

    public static final String TAG = QuickStartActivity.class.getSimpleName();
    @Inject
    public UserActionHandlers userActionHandlers;
    //  need an onbackpressed handler

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate and Bind
        QuickStartApplication application = (QuickStartApplication) getApplication();
        QuickStartAdapterComponent quickStartAdapterComponent = application.createQuickStartAdapterComponent();
        // bootstrap into dagger graph
        quickStartAdapterComponent.inject(this);
        final QuickStartActivityBinding quickStartActivityBinding = DataBindingUtil.setContentView(
                this,
                R.layout.quick_start_activity,
                quickStartAdapterComponent);

        // assign user action handlers
        quickStartActivityBinding.setUserActionHandlers(userActionHandlers);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        if (!userActionHandlers.backPressedConsumed())
            super.onBackPressed();
    }
}
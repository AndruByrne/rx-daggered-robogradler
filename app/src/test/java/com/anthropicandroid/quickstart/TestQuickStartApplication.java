package com.anthropicandroid.quickstart;

import android.support.annotation.NonNull;

import com.anthropicandroid.quickstart.modules.FirstObservableModule;
import com.anthropicandroid.quickstart.modules.MockFirstObservableModule;

/*
 * Created by Andrew Brin on 6/21/2016.
 */
public class TestQuickStartApplication extends QuickStartApplication{

    @NonNull
    @Override
    public FirstObservableModule getFirstObservableModule() {
        return new MockFirstObservableModule();
    }
}

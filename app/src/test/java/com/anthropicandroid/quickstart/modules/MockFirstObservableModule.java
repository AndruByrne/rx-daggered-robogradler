package com.anthropicandroid.quickstart.modules;

import javax.inject.Named;

import rx.Observable;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/*
 * Created by Andrew Brin on 6/21/2016.
 */
public class MockFirstObservableModule extends FirstObservableModule {

    public static final String TAG = MockFirstObservableModule.class.getSimpleName();

    @Override
    @Named("firstObs")
    public Observable<Integer> getFirstObs() {
        return Observable
                .range(0, 4)
                .map(new Func1<Integer, Integer>() {
                    @Override
                    public Integer call(Integer integer) {
                        return integer * 3;
                    }
                })
                .subscribeOn(Schedulers.newThread());
    }
}

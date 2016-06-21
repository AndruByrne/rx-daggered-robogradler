package com.anthropicandroid.quickstart.modules;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import rx.Observable;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/*
 * Created by Andrew Brin on 6/21/2016.
 */
@Module
public class FirstObservableModule {

    @Provides
    @Singleton
    @Named("firstObs")
    public Observable<Integer> getFirstObs(){
        return Observable.range(0,4).map(new Func1<Integer, Integer>() {
            @Override
            public Integer call(Integer integer) {
                return integer*5;
            }
        }).take(4).subscribeOn(Schedulers.newThread());
    }
}

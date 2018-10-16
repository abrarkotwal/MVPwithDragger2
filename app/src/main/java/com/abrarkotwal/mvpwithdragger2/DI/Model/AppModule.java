package com.abrarkotwal.mvpwithdragger2.DI.Model;

import android.app.Application;

import com.abrarkotwal.mvpwithdragger2.InitApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private InitApplication initApplication;

    public AppModule(InitApplication initApplication) {
        this.initApplication = initApplication;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return initApplication;
    }
}

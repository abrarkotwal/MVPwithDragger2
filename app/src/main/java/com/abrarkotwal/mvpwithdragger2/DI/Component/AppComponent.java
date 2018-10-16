package com.abrarkotwal.mvpwithdragger2.DI.Component;

import android.app.Application;
import android.content.Context;

import com.abrarkotwal.mvpwithdragger2.DI.Model.AppModule;
import com.abrarkotwal.mvpwithdragger2.DI.Model.ContextModule;
import com.abrarkotwal.mvpwithdragger2.DI.Model.DataModule;
import com.abrarkotwal.mvpwithdragger2.InitApplication;
import com.abrarkotwal.mvpwithdragger2.Model.Model;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, ContextModule.class})
public interface AppComponent {
    void inject(InitApplication initApplication);

    Context getContext();

    Model getFindItemsInteractor();

    Application getApplication();
}


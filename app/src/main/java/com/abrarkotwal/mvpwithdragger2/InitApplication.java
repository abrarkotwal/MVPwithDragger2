package com.abrarkotwal.mvpwithdragger2;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.abrarkotwal.mvpwithdragger2.DI.Component.AppComponent;
import com.abrarkotwal.mvpwithdragger2.DI.Component.DaggerAppComponent;
import com.abrarkotwal.mvpwithdragger2.DI.Model.AppModule;
import com.abrarkotwal.mvpwithdragger2.DI.Model.ContextModule;
import com.abrarkotwal.mvpwithdragger2.DI.Model.DataModule;

@SuppressLint("Registered")
public class InitApplication extends Application {

    private AppComponent component;

    public static InitApplication get(Context context) {
        return (InitApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .contextModule(new ContextModule(this))
                .dataModule(new DataModule())
                .build();
    }

    public AppComponent component() {
        return component;
    }
}

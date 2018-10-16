package com.abrarkotwal.mvpwithdragger2.DI.Model;

import com.abrarkotwal.mvpwithdragger2.Model.Model;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    public Model provideModelClass() {
        return new Model();
    }
}

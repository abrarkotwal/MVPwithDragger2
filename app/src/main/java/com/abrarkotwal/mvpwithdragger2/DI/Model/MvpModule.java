package com.abrarkotwal.mvpwithdragger2.DI.Model;

import com.abrarkotwal.mvpwithdragger2.Presenter.MainContract;
import com.abrarkotwal.mvpwithdragger2.Model.Model;
import com.abrarkotwal.mvpwithdragger2.Presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MvpModule {

    private MainContract.ViewCallBack viewCallBack;

    public MvpModule(MainContract.ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
    }

    @Provides
    public MainContract.ViewCallBack provideView() {
        return viewCallBack;
    }

    @Provides
    public MainContract.PresenterCallBack providePresenter(MainContract.ViewCallBack view, Model model) {
        return new MainPresenterImpl(view, model);
    }
}

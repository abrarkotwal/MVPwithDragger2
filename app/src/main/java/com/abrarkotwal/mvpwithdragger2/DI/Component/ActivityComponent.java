package com.abrarkotwal.mvpwithdragger2.DI.Component;

import com.abrarkotwal.mvpwithdragger2.DI.Model.MVPModule;
import com.abrarkotwal.mvpwithdragger2.DI.Scope.ActivityScope;
import com.abrarkotwal.mvpwithdragger2.View.MainActivity;
import com.abrarkotwal.mvpwithdragger2.Presenter.MainContract;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MVPModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    MainContract.PresenterCallBack getMainPresenter();
}

package com.sendi.dagger2demo.di

import com.sendi.dagger2demo.presenter.IPresenter
import com.sendi.dagger2demo.presenter.MainPresenter
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * @Date:2018/9/4
 * @Author: Asendi
 * @Description:
 */
@Module
abstract class BindModule {

    @Binds
//    @Singleton
    abstract fun bindPresenter(presenter: MainPresenter): IPresenter
}